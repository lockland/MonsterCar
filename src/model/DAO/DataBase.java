package model.DAO;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Adicionando o sqlite Driver ao netbeans
 * http://bloggerinme.wordpress.com/2011/11/02/how-to-use-sqlite-with-java-using-netbeans-ide/
 */

public final class DataBase {

    private String Driver;
    private String File;
    private String Url;
    private Connection conn;
    private PreparedStatement pstmt;
    private boolean transaction;

    public DataBase() {
        Driver = "org.sqlite.JDBC";
        File = "monster.sqlite";
        Url = "jdbc:sqlite:" + File;
        conn = null;
        pstmt = null;
        transaction = false;
        create();
    }

    /**
     * Connect to a DataBaseMysql
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     * @return void
     */
    public void connect() throws SQLException {
        if (conn != null) {
            return;
        }

        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, 
                    e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        this.conn = DriverManager.getConnection(this.Url);

        enableForeign_keys(true);
    }

    public boolean isTransaction() {
        return transaction;
    }

    public void create() {
        try {
            connect();
            executeUpdate("pragma foreign_keys = 1");

            close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                    "Não foi possivel criar ou acessar o banco de dados", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void enableForeign_keys(boolean isEnable) throws SQLException {
        int enable = (isEnable) ? 1 : 0;
        executeUpdate("pragma foreign_keys = " + enable + ";");
    }

    public void startTransaction() throws SQLException {
        this.conn.setAutoCommit(false);
        this.transaction = true;
    }

    public void commit() throws SQLException {
        this.conn.commit();
        this.transaction = false;
    }

    public void rollback() throws SQLException {
        this.conn.rollback();
        this.transaction = false;
    }

    public ResultSet executeQuery(String query, Object... fields)
            throws SQLException {

        this.pstmt = this.conn.prepareStatement(query);

        int i = 1;
        for (Object field : fields) {
            this.pstmt.setObject(i++, field);
        }

        ResultSet result = this.pstmt.executeQuery();
        return result;
    }

    public ResultSet executeQuery(String query)
            throws SQLException {
        this.pstmt = this.conn.prepareStatement(query);
        ResultSet result = this.pstmt.executeQuery();
        return result;
    }

    public int executeUpdateAndReturn(String query, Object... fields) throws SQLException {
        this.pstmt = this.conn.prepareStatement(query,
                Statement.RETURN_GENERATED_KEYS);
        int i = 1;
        for (Object field : fields) {
            this.pstmt.setObject(i++, field);
        }

        this.pstmt.executeUpdate();
        int keyGenerated = lastId(); 
              
        /* Para o mysql podemos usar
         * int keyGenerated = this.pstmt.executeUpdate();
         */
        
        closePreparedStatement();
        return keyGenerated;
    }

    public void executeUpdate(String query, Object... fields) throws SQLException {
        this.pstmt = this.conn.prepareStatement(query);
        int i = 1;
        for (Object field : fields) {
            this.pstmt.setObject(i++, field);
        }

        this.pstmt.executeUpdate();
        closePreparedStatement();
    }

    public void executeUpdate(String query) throws SQLException {
        this.pstmt = this.conn.prepareStatement(query);
        this.pstmt.executeUpdate();
        closePreparedStatement();
    }

    public int lastId() throws SQLException {
        int lastId = 0;
        ResultSet rs = this.pstmt.getGeneratedKeys();
        while (rs.next()) {
            lastId = rs.getInt(1);
        }
        return lastId;
    }

    public void close() {
        closePreparedStatement();
        closeConnection();
    }

    private void closePreparedStatement() {
        if (this.pstmt != null) {
            try {
                this.pstmt.close();
                this.pstmt = null;
            } catch (SQLException ex) {
            }
        }
    }

    private void closeConnection() {
        if ((this.conn != null) && (this.transaction == false)) {
            try {
                this.conn.close();
                this.conn = null;
            } catch (SQLException ex) {
            }
        }
    }

    public static void main(String[] args) {
        DataBase db = new DataBase();

        String query = "SELECT * FROM usuario "
                + "WHERE nome LIKE ? OR "
                + "cpf = ? OR "
                + "email = ?";

        String field = "fulano";
        String elemento;
        try {
            db.connect();
            ResultSet rs = db.executeQuery(query, "%" + field + "%", field, field);

            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.out.println("Erro " + ex.getMessage());
        }

        db.close();
    }
}

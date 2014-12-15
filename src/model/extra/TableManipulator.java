package model.extra;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import model.DAO.DataBase;
import model.DAO.QUERY;
import net.proteanit.sql.DbUtils;

/**
 * @author Lockland
 */
public class TableManipulator {

    public void populateTable(QUERY query, JTable table) {
        DataBase db = new DataBase();
        ResultSet rs = null;

        try {
            db.connect();
            rs = db.executeQuery(query.toString());
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
        } finally {
            db.close();
        }
    }
}

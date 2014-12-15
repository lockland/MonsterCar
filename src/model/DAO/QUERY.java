
package model.DAO;

public enum QUERY {
    
    
    SELECTCLIENTES("SELECT * FROM Cliente"),
    SELECTDESPACHANTES("SELECT * FROM Despachante"),
    SELECTFINANCEIRAS("SELECT * FROM Financeira"),
    SELECTVEICULOS("SELECT * FROM Veiculo"),
    SELECTMULTAS("SELECT * FROM Multa"),
    SELECTMANUTENCOES("SELECT * FROM Manutencao"),
    SELECTDESPESAS("SELECT * FROM Despesa"), 
    SELECTRECEITAS("SELECT * FROM Receita"),
    SELECTCAIXA("SELECT * FROM Caixa"),
    ;

    private String description = "";

    private QUERY(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
    
    
}

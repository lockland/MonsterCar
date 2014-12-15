package model.entidade;

/**
 * @author Lockland
 */
public final class Despesa extends Receita {

    public enum CATEGORIA {
        manutencao, pagamento
    };
    
    private String codComprovante;
    private CATEGORIA categoria;

    public Despesa(int id, String codComprovante, CATEGORIA categoria, String descricao, 
            String data, double valor) {
        super(id, descricao, data, valor);
        this.codComprovante = codComprovante;
        this.categoria = categoria;
    }

    public Despesa(String codComprovante, CATEGORIA categoria, 
            String descricao, String data, double valor) {
        super(descricao, data, valor);
        this.codComprovante = codComprovante;
        this.categoria = categoria;
    }

    public String getCodComprovante() {
        return codComprovante;
    }

    public CATEGORIA getCategoria() {
        return categoria;
    }
    
    public String getStringCategoria() {
        String categoria = "";
        switch (this.categoria){
            case manutencao:
                categoria = "manutenção";
                break;
            case pagamento:
                categoria = "pagamento";
                break;
        }
        return categoria;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{" 
                + "id=" + super.getId()
                + ", descricao=" + super.getDescricao()
                + ", data=" + super.getData()
                + ", valor=" + super.getValor()
                + ", codComprovante=" + codComprovante 
                + ", categoria=" + getStringCategoria()
                + '}';
    }
}

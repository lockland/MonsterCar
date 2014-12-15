package model.entidade;

/**
 * @author Lockland
 */
public class Manutencao {

    private int id;
    private String descricao;
    private String codComprovante;
    private String data;

    public Manutencao(int id, String descricao, String codComprovante, String data) {
        this.id = id;
        this.descricao = descricao;
        this.codComprovante = codComprovante;
        this.data = data;
    }
    
    public Manutencao(String descricao, String codComprovante, String data) {
        this.id = 0;
        this.descricao = descricao;
        this.codComprovante = codComprovante;
        this.data = data;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodComprovante() {
        return codComprovante;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" 
                + "id=" + id 
                + ", descricao=" + descricao 
                + ", codComprovante=" + codComprovante 
                + ", data=" + data
                + '}';
    }
    
    
}

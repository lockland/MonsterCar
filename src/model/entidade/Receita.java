package model.entidade;

/**
 * @author Lockland
 */
public class Receita {

    private int id;
    private String descricao;
    private String data;
    private double valor;

    public Receita(int id, String descricao, String data, double valor) {
        this(descricao, data, valor);
        this.id = id;
    }

    public Receita(String descricao, String data, double valor) {
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" 
                + "id=" + id 
                + ", descricao=" + descricao 
                + ", data=" + data 
                + ", valor=" + valor 
                + '}';
    }
 
    
}

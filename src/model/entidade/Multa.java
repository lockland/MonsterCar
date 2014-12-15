package model.entidade;

/**
 * @author Lockland
 */
public class Multa {
    
    private int id;
    private String descricao;
    private double valor;
    private String vencimento;
    private boolean paga;

    public Multa(int id, String descricao, double valor, String vencimento, boolean paga) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = vencimento;
        this.paga = paga;
    }

    public Multa(String descricao, double valor, String vencimento, boolean paga) {
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = vencimento;
        this.paga = paga;
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

    public double getValor() {
        return valor;
    }

    public String getVencimento() {
        return vencimento;
    }

    public boolean isPaga() {
        return paga;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" 
                + "id=" + id 
                + ", descricao=" + descricao 
                + ", valor=" + valor 
                + ", vencimento=" + vencimento 
                + ", paga=" + paga 
                + '}';
    }
    
    
    
}

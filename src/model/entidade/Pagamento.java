package model.entidade;

/**
 * @author Lockland
 */
public final class Pagamento {

    private int id;
    private TIPOPAGAMENTO tipo;
    private String data;
    private int idFuncionario;
    private double valor;

    public Pagamento(int id, TIPOPAGAMENTO tipo, String data,
            int idFuncionario, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.data = data;
        this.idFuncionario = idFuncionario;
        this.valor = valor;
    }

    public Pagamento(TIPOPAGAMENTO tipo, String data,
            int idFuncionario, double valor) {
        this.tipo = tipo;
        this.data = data;
        this.idFuncionario = idFuncionario;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TIPOPAGAMENTO getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{"
                + "id=" + id
                + ", tipo=" + tipo
                + ", data=" + data
                + ", idFuncionario=" + idFuncionario
                + ", valor=" + valor
                + '}';
    }
}

package model.entidade;

/**
 *
 * @author Lockland
 */
public enum TIPOPAGAMENTO {

    SALARIO("salario"),
    ADIANTAMENTO("adiantamento"),
    COMISSAO("comissão");
    private String description = "";

    private TIPOPAGAMENTO(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}

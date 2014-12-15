package model.entidade;

/**
 *
 * @author Lockland
 */
public enum MESSAGES {

    DEFAULT("?"),
    CAI_FECHADO("Caixa esta fechado"),
    CAI_SALDO_INS("Saldo insuficiente"),;
    private String description = "";

    private MESSAGES(String description) {
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

package model.entidade;

import model.extra.Date;

/**
 * @author Lockland
 */
public class Caixa {

    private int id;
    private double saldo;
    private String dataOpen;
    private String dataClose;
    private boolean open;

    public Caixa(int id, double saldo, String dataOpen, String dataClose) {
        this(saldo, dataOpen, dataClose);
        this.id = id;
        this.open = false;
    }

    public Caixa(double saldo, String dataOpen, String dataClose) {
        this(saldo);
        this.id = 0;
        this.dataOpen = dataOpen;
        this.dataClose = dataClose;
        this.open = false;
    }

    public Caixa(double saldo) {
        this.id = 0;
        this.saldo = saldo;
        this.dataOpen = null;
        this.dataClose = null;
        this.open = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void abrir() {
        this.dataOpen = new Date().toString();
        this.open = true;
    }

    public void fechar() {
        this.dataClose = new Date().toString();
        this.open = false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDataOpen() {
        return dataOpen;
    }

    public String getDataClose() {
        return dataClose;
    }

    public void addSaldoCaixa(double saldo) throws Exception {
        MESSAGES message = MESSAGES.DEFAULT;
        if (open) {
            this.saldo += saldo;
            return;
        } else {
            message = MESSAGES.CAI_FECHADO;
        }

        throw new Exception(message.toString());
    }

    public void getSaldoFromCaixa(double saldo) throws Exception {
        MESSAGES message;
        if (open) {
            if (saldoEhSuficiente(saldo)) {
                this.saldo -= saldo;
                return;
            } else {
                message = MESSAGES.CAI_SALDO_INS;
            }
        } else {
            message = MESSAGES.CAI_FECHADO;
        }

        throw new Exception(message.toString());
    }

    private boolean saldoEhSuficiente(double saldo) {
        if (saldo > this.saldo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{"
                + "id=" + id
                + ", saldo=" + saldo
                + ", dataOpen=" + dataOpen
                + ", dataClose=" + dataClose
                + ", open=" + open
                + '}';
    }
}

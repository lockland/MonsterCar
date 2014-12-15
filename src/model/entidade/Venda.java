package model.entidade;

import model.extra.Date;

public class Venda {

    public enum ESTADO {ANALISE, POSVENDA, FINALIZADA};
    
    private int id;
    private Veiculo veiculo;
    private Funcionario vendedor;
    private Cliente cliente;
    private Financeira financeira;
    private int qtdParcelas;
    private double valorParcelas;
    private double valorTotal;
    private String data;
    private ESTADO estado;

    public Venda(int id, Veiculo veiculo, Funcionario vendedor, Cliente cliente, 
            Financeira financeira, int qtdParcelas, double valorParcelas,
            String data, ESTADO estado) {
        this.id = id;
        this.veiculo = veiculo;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.financeira = financeira;
        this.qtdParcelas = qtdParcelas;
        this.valorParcelas = valorParcelas;
        this.valorTotal = getValorTotalVenda();
        this.data = data;
        this.estado = estado;
    }

    public Venda(Veiculo veiculo, Funcionario vendedor, Cliente cliente, 
            Financeira financeira, int qtdParcelas, double valorParcelas,
            String data, ESTADO estado) {
        this.id = 0;
        this.veiculo = veiculo;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.financeira = financeira;
        this.qtdParcelas = qtdParcelas;
        this.valorParcelas = valorParcelas;
        this.valorTotal = getValorTotalVenda();
        this.data = data;
        this.estado = estado;
    }

    public Venda() {
        this.id = 0;
        this.veiculo = null;
        this.vendedor = null;
        this.cliente = null;
        this.qtdParcelas = 0;
        this.valorParcelas = 0;
        this.valorTotal = getValorTotalVenda();
        this.data = new Date().toString();
        this.estado = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Financeira getFinanceira() {
        return financeira;
    }

    public void setFinanceira(Financeira financeira) {
        this.financeira = financeira;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public double getValorParcelas() {
        return valorParcelas;
    }

    public void setValorParcelas(double valorParcelas) {
        this.valorParcelas = valorParcelas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ESTADO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }
    
    private double getValorTotalVenda(){
        return valorParcelas * qtdParcelas;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{"
                + "id=" + id
                + ", veiculo=" + veiculo
                + ", vendedor=" + vendedor
                + ", cliente=" + cliente
                + ", financeira=" + financeira
                + ", qtdParcelas=" + qtdParcelas
                + ", valorParcelas=" + valorParcelas
                + ", valorTotal=" + valorTotal
                + ", data=" + data
                + ", estado=" + estado
                + '}';
    }
}
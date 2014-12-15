package model.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lockland
 */
public class Veiculo {

    public enum TIPO {C, M}
    
    private int id;
    private String placa;
    private String renavam;
    private String modelo;
    private String cor;
    private String anoFabricacao;
    private int kmRodados;
    private String observacoes;
    private boolean vendido;
    private double valor;
    private DonoVeiculo antigoDono;
    private TIPO tipo;
    private List<Multa> multas;
    private List<Manutencao> historico;

    public Veiculo(int id, String placa, String renavam, String modelo, String cor,
            String anoFabricacao, DonoVeiculo antigoDono, int kmRodados, String observacoes,
            boolean vendido, double valor, TIPO tipo, List<Multa> multas, List<Manutencao> historico) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.kmRodados = kmRodados;
        this.observacoes = observacoes;
        this.vendido = vendido;
        this.valor = valor;
        this.antigoDono = antigoDono;
        this.tipo = tipo;
        this.multas = multas;
        this.historico = historico;
    }

    public Veiculo(String placa, String renavam, String modelo, String cor,
            String anoFabricacao, DonoVeiculo antigoDono, int kmRodados, String observacoes, 
            boolean vendido, double valor, TIPO tipo, List<Multa> multas, List<Manutencao> historico) {
        this.id = 0;
        this.placa = placa;
        this.renavam = renavam;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.kmRodados = kmRodados;
        this.observacoes = observacoes;
        this.antigoDono = antigoDono;
        this.vendido = vendido;
        this.valor = valor;
        this.tipo = tipo;
        this.multas = multas;
        this.historico = historico;
    }

    public Veiculo(String placa, String renavam, String modelo, String cor,
            String anoFabricacao, DonoVeiculo antigoDono, int kmRodados, 
            boolean vendido, double valor, TIPO tipo) {
        this.id = 0;
        this.placa = placa;
        this.renavam = renavam;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.kmRodados = kmRodados;
        this.observacoes = "";
        this.antigoDono = antigoDono;
        this.vendido = vendido;
        this.valor = valor;
        this.tipo = tipo;
        this.multas = new ArrayList<Multa>();
        this.historico = new ArrayList<Manutencao>();
    }

    public Veiculo() {
        this.id = 0;
        this.placa = "";
        this.renavam = "";
        this.modelo = "";
        this.cor = "";
        this.anoFabricacao = "";
        this.kmRodados = 0;
        this.observacoes = "";
        this.vendido = false;
        this.valor = 0;
        this.antigoDono = null;
        this.tipo = TIPO.C;
        this.multas = new ArrayList<Multa>();
        this.historico = new ArrayList<Manutencao>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public TIPO getTipo() {
        return tipo;
    }
    
    public String getStringTipo() {
        return (tipo == TIPO.C) ? "carro" : "moto";
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public List<Multa> getMultas() {
        return multas;
    }

    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }

    public List<Manutencao> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Manutencao> historico) {
        this.historico = historico;
    }

    public DonoVeiculo getAntigoDono() {
        return antigoDono;
    }

    public void setAntigoDono(DonoVeiculo antigoDono) {
        this.antigoDono = antigoDono;
    }

    public void addMulta(Multa multa) {
        multas.add(multa);
    }

    public void addManutencao(Manutencao manutencao) {
        historico.add(manutencao);
    }
    
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" 
                + "id=" + id 
                + ", placa=" + placa 
                + ", renavam=" + renavam 
                + ", modelo=" + modelo 
                + ", cor=" + cor 
                + ", anoFabricacao=" + anoFabricacao 
                + ", kmRodados=" + kmRodados 
                + ", observacoes=" + observacoes 
                + ", vendido=" + vendido
                + ", valor=" + valor
                + ", tipo=" + tipo
                + ", antigoDono=" + antigoDono
                + ", multas=" + multas 
                + ", historico=" + historico
                + '}';
    }
    
    
}

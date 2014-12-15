package model.entidade;

import model.extra.Date;

/**
 * @author Lockland
 */
public class Funcionario extends Pessoa {

    public enum FUNCAO {

        vendedor, mecanico
    };
    private int id;
    private boolean ativo;
    private String admissao;
    private String demissao;
    private String senha;
    private double salario;
    private int comissao;
    private FUNCAO funcao;

    public Funcionario(
            int id,
            boolean ativo,
            String admissao,
            String demissao,
            String senha,
            double salario,
            int comissao,
            FUNCAO funcao,
            String nome,
            Endereco endereco,
            String CPF,
            String RG,
            String dataNasc,
            String Celular,
            String Residencial,
            ESTADOCIVIL estadoCivil,
            SEXO sexo,
            String email) {

        super(
                nome,
                endereco,
                CPF,
                RG,
                dataNasc,
                Celular,
                Residencial,
                estadoCivil,
                sexo,
                email);

        this.id = id;
        this.ativo = ativo;
        this.admissao = admissao;
        this.demissao = demissao;
        this.senha = senha;
        this.salario = salario;
        this.comissao = comissao;
        this.funcao = funcao;
    }

    public Funcionario(
            int id,
            boolean ativo,
            String admissao,
            String senha,
            double salario,
            int comissao,
            FUNCAO funcao,
            String nome,
            Endereco endereco,
            String CPF,
            String RG,
            String dataNasc,
            String Celular,
            String Residencial,
            ESTADOCIVIL estadoCivil,
            SEXO sexo,
            String email) {

        super(
                nome,
                endereco,
                CPF,
                RG,
                dataNasc,
                Celular,
                Residencial,
                estadoCivil,
                sexo,
                email);
        this.id = id;
        this.ativo = ativo;
        this.admissao = admissao;
        this.demissao = "";
        this.senha = senha;
        this.salario = salario;
        this.comissao = comissao;
        this.funcao = funcao;
    }

    public Funcionario(
            boolean ativo,
            String admissao,
            String senha,
            double salario,
            int comissao,
            FUNCAO funcao,
            String nome,
            Endereco endereco,
            String CPF,
            String RG,
            String dataNasc,
            String Celular,
            String Residencial,
            ESTADOCIVIL estadoCivil,
            SEXO sexo,
            String email) {

        super(
                nome,
                endereco,
                CPF,
                RG,
                dataNasc,
                Celular,
                Residencial,
                estadoCivil,
                sexo,
                email);

        this.id = 0;
        this.ativo = ativo;
        this.admissao = admissao;
        this.demissao = "";
        this.senha = senha;
        this.salario = salario;
        this.comissao = comissao;
        this.funcao = funcao;
    }

    public Funcionario() {
        super();
        this.ativo = false;
        this.admissao = new Date().toString();
        this.demissao = "";
        this.senha = "";
        this.salario = 0.0;
        this.comissao = 10;
        this.funcao = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public String getDemissao() {
        return demissao;
    }

    public void setDemissao(String demissao) {
        this.demissao = demissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public FUNCAO getFuncao() {
        return funcao;
    }

    public void setFuncao(FUNCAO funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{"
                + "id=" + id
                + super.toString()
                + ", ativo=" + ativo
                + ", admissao=" + admissao
                + ", demissao=" + demissao
                + ", senha=" + senha
                + ", salario=" + salario
                + ", comissao=" + comissao
                + ", funcao=" + funcao
                + '}';
    }
}

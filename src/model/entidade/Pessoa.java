package model.entidade;

/**
 * @author Lockland
 */
public abstract class Pessoa {

    public enum SEXO {M, F};
    
    private String nome;
    private String CPF;
    private String RG;
    private Endereco endereco;
    private String dataNasc;
    private String Celular;
    private String Residencial;
    private ESTADOCIVIL estadoCivil;
    private SEXO sexo;
    private String email;

    public Pessoa(String nome, Endereco endereco, String CPF, String RG,
            String dataNasc, String Celular, String Residencial,
            ESTADOCIVIL estadoCivil, SEXO sexo, String email) {

        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.Celular = Celular;
        this.Residencial = Residencial;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.email = email;
    }

    public Pessoa() {

        this.nome = "";
        this.CPF = "";
        this.RG = "";
        this.endereco = null;
        this.dataNasc = "";
        this.Celular = "";
        this.Residencial = "";
        this.estadoCivil = null;
        this.sexo = null;
        this.email = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getResidencial() {
        return Residencial;
    }

    public void setResidencial(String Residencial) {
        this.Residencial = Residencial;
    }

    public ESTADOCIVIL getEstadoCivil() {
        return estadoCivil;
    }
    
    public String getStringEstadoCivil() {
        return estadoCivil.getDescription();
    }

    public void setEstadoCivil(ESTADOCIVIL estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public SEXO getSexo() {
        return sexo;
    }
    
    public String getStringSexo() {
        return (this.sexo == SEXO.M) ? "masculino" : "feminino";
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        
        return ", nome=" + nome
                + ", CPF=" + CPF
                + ", RG=" + RG
                + ", endereco=" + endereco
                + ", dataNasc=" + dataNasc
                + ", Celular=" + Celular
                + ", Residencial=" + Residencial
                + ", estadoCivil=" + getStringEstadoCivil()
                + ", sexo=" + getStringSexo()
                + ", email=" + email;
    }
}

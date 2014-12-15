package model.entidade;

/**
 * @author Lockland
 */
public final class Financeira {
    
    private int id;
    private String nomeFantasia;
    private String cnpj;
    private Endereco endereco;
    private String telefone;
    private String registro;

    public Financeira(String nomeFantasia, String cnpj, 
            Endereco endereco, String telefone, String registro) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.registro = registro;
    }

    public Financeira(int id, String nomeFantasia, String cnpj, 
            Endereco endereco, String telefone, String registro) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.registro = registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRegistro() {
        return registro;
    }

    @Override
    public String toString() {
        return "Financeira{" 
                + "id=" + id 
                + ", nomeFantasia=" + nomeFantasia 
                + ", cnpj=" + cnpj 
                + ", endereco=" + endereco 
                + ", telefone=" + telefone 
                + ", registro=" + registro 
                + '}';
    }
    
    
}

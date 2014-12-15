package model.entidade;

/**
 * @author Lockland
 */
public class Endereco {
    
    private int id;
    private String endereco;
    private String bairro;
    private String CEP;
    private String Cidade;
    private String UF;

    public Endereco(String endereco, String bairro, 
            String CEP, String Cidade, String UF) {
        this.endereco = endereco;
        this.bairro = bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.UF = UF;
    }

    public Endereco(int id, String endereco, String bairro, 
                     String CEP, String Cidade, String UF) {
        this.id = id;
        this.endereco = endereco;
        this.bairro = bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.UF = UF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getUF() {
        return UF;
    }

    @Override
    public String toString() {
        return "Endereco{" 
                + "id=" + id 
                + ", endereco=" + endereco 
                + ", bairro=" + bairro 
                + ", CEP=" + CEP 
                + ", Cidade=" + Cidade 
                + ", UF=" + UF 
                + '}';
    }
    
}

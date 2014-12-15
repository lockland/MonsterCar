package model.entidade;

/**
 * @author Lockland
 */
public final class Despachante {
    
    private int id;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String registro;

    public Despachante(int id, String nome, Endereco endereco, 
            String telefone, String registro) {
        this(nome, endereco, telefone, registro);
        this.id = id;
    }

    public Despachante(String nome, Endereco endereco, 
            String telefone, String registro) {
        this.nome = nome;
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

    public String getNome() {
        return nome;
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
        return this.getClass().getSimpleName() + "{" 
                + "id=" + id 
                + ", nome=" + nome 
                + ", endereco=" + endereco 
                + ", telefone=" + telefone 
                + ", registro=" + registro 
                + '}';
    }
    
    
}

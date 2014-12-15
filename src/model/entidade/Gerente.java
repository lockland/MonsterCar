package model.entidade;

/**
 * @author Lockland
 */
public class Gerente {

    private int id;
    private String senha;

    public Gerente(int id, String senha) {
        this.id = id;
        this.senha = senha;
    }

    public Gerente(String senha) {
        this.id = 0;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{"
                + "id=" + id
                + ", senha=" + senha
                + '}';
    }
}

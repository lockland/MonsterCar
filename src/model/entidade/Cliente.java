package model.entidade;

/**
 * @author Lockland
 */
public final class Cliente extends Pessoa {

    private int id;

    public Cliente(int id, String nome, Endereco endereco,
            String CPF, String RG, String dataNasc,
            String Celular, String Residencial, ESTADOCIVIL estadoCivil,
            SEXO sexo, String email) {
        super(nome, endereco, CPF, RG, dataNasc,
                Celular, Residencial, estadoCivil, sexo, email);
        this.id = id;
    }

    public Cliente(String nome, Endereco endereco,
            String CPF, String RG, String dataNasc,
            String Celular, String Residencial, ESTADOCIVIL estadoCivil,
            SEXO sexo, String email) {
        super(nome, endereco, CPF, RG, dataNasc,
                Celular, Residencial, estadoCivil, sexo, email);
        this.id = 0;
    }

    public Cliente() {
        super();
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{"
                + "id=" + id
                + super.toString()
                + '}';
    }
}

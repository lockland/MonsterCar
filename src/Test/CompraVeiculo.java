package Test;

import model.entidade.Caixa;
import model.entidade.Cliente;
import model.entidade.DonoVeiculo;
import model.entidade.ESTADOCIVIL;
import model.entidade.Endereco;
import model.entidade.Gerente;
import model.extra.Date;

/**
 * @author Lockland
 */
public class CompraVeiculo {
    
    public static void main(String[] args) {
        Caixa cx = new Caixa(2000);
        
        DonoVeiculo dv = new DonoVeiculo(
                1,
                "dono nome",
                new Endereco("endereco", "bairro", "CEP", "cidade", "RS"),
                "CPF",
                "RG",
                new Date().format("dd/MM/yyyy", "2012-12-12"),
                "Celular",
                "Residencial",
                ESTADOCIVIL.valueOf("S"),
                Cliente.SEXO.valueOf("F"),
                "Email"
        );
        
        Gerente ge = new Gerente("Senha");
    }
}

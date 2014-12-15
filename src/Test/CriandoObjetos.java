package Test;

import java.util.ArrayList;
import java.util.List;
import model.entidade.Caixa;
import model.entidade.Cliente;
import model.entidade.Despachante;
import model.entidade.Despesa;
import model.entidade.DonoVeiculo;
import model.entidade.ESTADOCIVIL;
import model.entidade.Endereco;
import model.entidade.Financeira;
import model.entidade.Funcionario;
import model.entidade.Gerente;
import model.entidade.Manutencao;
import model.entidade.Multa;
import model.entidade.Pagamento;
import model.entidade.Receita;
import model.entidade.TIPOPAGAMENTO;
import model.entidade.Veiculo;
import model.entidade.Venda;
import model.extra.Date;

public class CriandoObjetos {

    public static void main(String[] args) {
        
        List<Despesa> despesas = new ArrayList<Despesa>();
        List<Receita> receitas = new ArrayList<Receita>();

        Funcionario fv1 = new Funcionario(
                1,
                true,
                new Date().toString(),
                "Senha",
                100.0,
                10,
                Funcionario.FUNCAO.vendedor,
                "Nome fv1",
                new Endereco("Rua fv1", "Bairro", "00000-900", "Cidade", "RS"),
                "0000000000",
                "RG",
                new Date().format("yyyy-MM-dd", "12/12/2012"),
                "Celular",
                "Residencial",
                ESTADOCIVIL.C,
                Funcionario.SEXO.M,
                "Email"
        );

        System.out.println(fv1);

        Cliente cl = new Cliente(
                1,
                "cliente nome",
                new Endereco("endereco", "bairro", "CEP", "cidade", "RS"),
                "CPF",
                "RG",
                new Date().format("dd/MM/yyyy", "2012-12-12"),
                "Celular",
                "Residencial",
                ESTADOCIVIL.S,
                Cliente.SEXO.F,
                "Email"
        );

        System.out.println(cl);

        // Exemplo de criação com dados vindos do banco
        Cliente cl2 = new Cliente(
                1,
                "cliente nome",
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

        System.out.println(cl2);

        Caixa cx = new Caixa(2000);
        cx.abrir();
        // ----------------- start transações ------------------------ //
        try {
            cx.getSaldoFromCaixa(200);
            cx.getSaldoFromCaixa(200);
            cx.getSaldoFromCaixa(200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(cx);
        try {
            cx.addSaldoCaixa(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(cx);

        try {
            cx.getSaldoFromCaixa(20);
        } catch (Exception e) {
            e.printStackTrace();
        }

        cx.fechar();
        // ----------------- end transações ------------------------ //

        System.out.println(cx);

        Despachante dsp = new Despachante(
                "nome despa",
                new Endereco("Endereco", "Bairro", "CEP", "Cidade", "RS"),
                "Fone",
                "000000000"
        );

        System.out.println(dsp);

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
                "Email");

        System.out.println(dv);

        Despesa desp = new Despesa(
                "Comprovante",
                Despesa.CATEGORIA.manutencao,
                "Despesa manu",
                new Date().toString(),
                4000);

        despesas.add(desp);

        cx.abrir();
        try {
            cx.getSaldoFromCaixa(400);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(desp);
        System.out.println(cx);

        Financeira fin = new Financeira(
                "Nome Fantasia",
                "000043423",
                new Endereco("endereco", "bairro", "CEP", "cidade", "RS"),
                "Telefone",
                "Registro"
        );

        Gerente ge = new Gerente("Senha");

        System.out.println(ge);


        Veiculo vei = new Veiculo(
                "Placa",
                "Renavam",
                "Palio",
                "Azul",
                "2005",
                dv,
                23000,
                false,
                20000,
                Veiculo.TIPO.C
        );

        vei.setId(1);

        Manutencao man = new Manutencao(
                "ReformaCarburador",
                desp.getCodComprovante(),
                new Date().toString()
        );

        Manutencao man2 = new Manutencao(
                "ReformaCarburador",
                desp.getCodComprovante(),
                new Date().toString()
        );

        System.out.println(man);
        System.out.println(man2);

        vei.addManutencao(man);
        vei.addManutencao(man2);

        Multa multa = new Multa(vei.getId(), "Estacionamento Proibido", 200, "20/12/2014", false);
        Multa multa2 = new Multa(vei.getId(), "Proibido Sinal", 200, "20/12/2014", true);

        vei.addMulta(multa);
        vei.addMulta(multa2);

        System.out.println(vei);

        Pagamento pg = new Pagamento(TIPOPAGAMENTO.SALARIO, new Date().toString(), fv1.getId(), fv1.getSalario());

        System.out.println(pg);

        despesas.add(new Despesa(
                null,
                Despesa.CATEGORIA.pagamento,
                "pagamento " + fv1.getNome(),
                new Date().toString(),
                fv1.getSalario()));

        try {
            cx.getSaldoFromCaixa(pg.getValor());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Receita receita = new Receita("Pagamento Veiculo", new Date().toString(), 2000);
        
        receitas.add(receita);
        
        try{
            cx.addSaldoCaixa(receita.getValor());
        } catch (Exception e){
            e.printStackTrace();
        }

        cx.fechar();
        System.out.println(cx);
        
        Venda vd = new Venda(1, 
                vei, 
                fv1, 
                cl2,
                fin,
                1, 
                1000, 
                new Date().toString(), 
                Venda.ESTADO.FINALIZADA);
        
        System.out.println(vd);
        
        System.out.println(new Date().toFormat("dd-MM"));
        
    }
}

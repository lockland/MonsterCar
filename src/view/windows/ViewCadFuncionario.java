
package view.windows;

import comp.JCalendar;

/**
 *
 * @author sidney
 */
public class ViewCadFuncionario extends javax.swing.JInternalFrame {

    public ViewCadFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadFuncionario = new javax.swing.JPanel();
        estado = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        cep = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        endereco = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        estadoCivil = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        rbtnFem = new javax.swing.JRadioButton();
        cbEstadoCivil = new javax.swing.JComboBox();
        sexo = new javax.swing.JLabel();
        rbtnMasc = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        bairro = new javax.swing.JLabel();
        rg = new javax.swing.JLabel();
        telefone1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cbDataNasc = new JCalendar(false);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        txtComissao = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cbAdmissao = new JCalendar(false);
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Funcionários");
        setVisible(false);

        PainelCadFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Funcionários"));

        estado.setText("UF:");

        celular.setText("Celular: ");

        cep.setText("CEP:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MT", "MS", "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RS", "RO", "RR", "SC", "SE", "SP" }));

        endereco.setText("Endereço:");

        nome.setText("Nome:");

        estadoCivil.setText("Estado Civil:");

        cpf.setText("CPF:");

        rbtnFem.setText("Feminino");

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro (a)", "Casado (a)", "Separado (a)", "Viuvo (a)" }));

        sexo.setText("Sexo:");

        rbtnMasc.setText("Masculino");

        jLabel1.setText("Data Nascimento");

        cidade.setText("Cidade:");

        email.setText("Email:");

        bairro.setText("Bairro:");

        rg.setText("RG:");

        telefone1.setText("Telefone:");

        try{
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbDataNasc.setEditable(true);
        cbDataNasc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1" }));

        jLabel2.setText("Comissão:");

        jLabel3.setText("Salário:");

        jLabel4.setText("Senha:");


		try {
			txtComissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###%")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtComissao.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

		jLabel5.setText("Função:");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Mecânico" }));

		jLabel6.setText("Admissão");

		cbAdmissao.setEditable(true);
		cbAdmissao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1" }));

		javax.swing.GroupLayout PainelCadFuncionarioLayout = new javax.swing.GroupLayout(PainelCadFuncionario);
		PainelCadFuncionario.setLayout(PainelCadFuncionarioLayout);
		PainelCadFuncionarioLayout.setHorizontalGroup(
			PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
						.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(endereco)
							.addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
										.addComponent(rbtnFem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(rbtnMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(14, 14, 14)
										.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
											.addComponent(estadoCivil)
											.addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
									.addComponent(sexo))
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
									.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
										.addGap(21, 21, 21)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
									.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
										.addGap(18, 18, 18)
										.addComponent(cbDataNasc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
						.addGap(66, 66, 66))
					.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
						.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(jPasswordField1)
									.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel5))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(cbAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
							.addComponent(txtEmail)
							.addComponent(txtEndereco)
							.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadFuncionarioLayout.createSequentialGroup()
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(bairro)
									.addComponent(txtBairro))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
										.addComponent(cep)
										.addGap(0, 0, Short.MAX_VALUE))
									.addComponent(txtCep))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(estado)
									.addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(42, 42, 42))
							.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(cidade)
									.addComponent(txtCidade))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(telefone1)
									.addComponent(txtTelefone))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(txtCelular)
									.addComponent(celular)))
							.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
									.addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelCadFuncionarioLayout.createSequentialGroup()
										.addComponent(rg)
										.addGap(0, 0, Short.MAX_VALUE))
									.addComponent(txtRg, javax.swing.GroupLayout.Alignment.LEADING))
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
										.addGap(12, 12, 12)
										.addComponent(cpf))
									.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(txtCpf))))
							.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
										.addComponent(txtNome)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
									.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
										.addComponent(nome)
										.addGap(214, 214, 214)))
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(jTextField2)
									.addComponent(jLabel3))))
						.addContainerGap())))
		);
		PainelCadFuncionarioLayout.setVerticalGroup(
			PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(PainelCadFuncionarioLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(nome)
					.addComponent(jLabel2)
					.addComponent(jLabel3))
				.addGap(1, 1, 1)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(10, 10, 10)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(cpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel1))
					.addComponent(sexo))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(rbtnFem)
					.addComponent(rbtnMasc)
					.addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(cbDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel4)
					.addComponent(jLabel5)
					.addComponent(jLabel6))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(cbAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(endereco)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(cep, javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(bairro)
						.addComponent(estado)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(cidade)
					.addComponent(telefone1)
					.addComponent(celular))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(PainelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(11, 11, 11)
				.addComponent(email)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(27, Short.MAX_VALUE))
		);

		btnNovo.setText("Novo");
		btnNovo.setBorder(null);
		btnNovo.setMaximumSize(new java.awt.Dimension(40, 25));
		btnNovo.setMinimumSize(new java.awt.Dimension(40, 25));
		btnNovo.setPreferredSize(new java.awt.Dimension(40, 25));

		btnSalvar.setText("Salvar");
		btnSalvar.setBorder(null);
		btnSalvar.setMaximumSize(new java.awt.Dimension(40, 25));
		btnSalvar.setMinimumSize(new java.awt.Dimension(40, 25));
		btnSalvar.setPreferredSize(new java.awt.Dimension(40, 25));

		btnExcluir.setText("Excluir");
		btnExcluir.setBorder(null);
		btnExcluir.setMaximumSize(new java.awt.Dimension(40, 25));
		btnExcluir.setMinimumSize(new java.awt.Dimension(40, 25));
		btnExcluir.setPreferredSize(new java.awt.Dimension(40, 25));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(PainelCadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addContainerGap())
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(25, 25, 25))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(PainelCadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCadFuncionario;
    private javax.swing.JLabel bairro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbAdmissao;
    private javax.swing.JComboBox cbDataNasc;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JComboBox cbEstadoCivil;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel estadoCivil;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel nome;
    private javax.swing.JRadioButton rbtnFem;
    private javax.swing.JRadioButton rbtnMasc;
    private javax.swing.JLabel rg;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel telefone1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtComissao;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

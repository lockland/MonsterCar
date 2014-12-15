package view.windows;

import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import model.extra.Date;

/**
 * Referencias utilizadas
 * http://www.java2s.com/Code/Java/Swing-JFC/MnemonicSample.htm Telas baseadas
 * em http://www.superdownloads.com.br/download/177/revenda-veiculos/
 * http://www.youtube.com/watch?v=QAWQP9puXNE&list=PLWGSF4J6nspb7o4xeVTiWkRW8rcaeH6Hn
 *
 * icones http://www.iconfinder.com/ http://www.iconesbr.net
 * http://www.iconarchive.com
 *
 * Reports:
 * http://www.dsc.ufcg.edu.br/~jacques/cursos/daca/html/documentviews/relatorios.htm
 *
 */
/**
 *
 * @author Lockland
 */
public class MainForm extends javax.swing.JFrame {

    DialogGerentePassword dgp;

    public MainForm() {
        initComponents();
        setDate();
        dgp = new DialogGerentePassword();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        language_group = new javax.swing.ButtonGroup();
        pn_background = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        pn_cadastro = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCadastro = new javax.swing.JButton();
        lblDescCadastro = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        pn_busca = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnBusca = new javax.swing.JButton();
        lblDescBusca = new javax.swing.JLabel();
        lblBusca = new javax.swing.JLabel();
        pn_financeiro = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        btnFinanceiro = new javax.swing.JButton();
        lblDescFinanceiro = new javax.swing.JLabel();
        lblFinanceiro = new javax.swing.JLabel();
        pn_documentacao = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        btnDocumentacao = new javax.swing.JButton();
        lblDescDocumentacao = new javax.swing.JLabel();
        lblDocumentacao = new javax.swing.JLabel();
        pn_language = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblDate = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnConfiguracoes = new javax.swing.JMenu();
        setPasswordGerente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MonsterCar - Revenda de Veículos");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setName("MonsterFrame"); // NOI18N
        setResizable(false);

        pn_background.setMaximumSize(new java.awt.Dimension(790, 480));
        pn_background.setPreferredSize(new java.awt.Dimension(790, 480));

        header.setBackground(new java.awt.Color(0, 51, 102));
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/header.png"))); // NOI18N
        header.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        header.setOpaque(true);

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/dados64x64.png"))); // NOI18N
        btnCadastro.setMnemonic(KeyEvent.VK_C);
        btnCadastro.setActionCommand("Cadastro");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        lblDescCadastro.setText("<html>Cadastro de clientes, veiculos, funcionarios, despachantes e financeiras</html>");

        lblCadastro.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ico_categoria.png"))); // NOI18N
        lblCadastro.setText("Cadastros ( ALT + C )");

        javax.swing.GroupLayout pn_cadastroLayout = new javax.swing.GroupLayout(pn_cadastro);
        pn_cadastro.setLayout(pn_cadastroLayout);
        pn_cadastroLayout.setHorizontalGroup(
            pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(pn_cadastroLayout.createSequentialGroup()
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_cadastroLayout.setVerticalGroup(
            pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Lupa64x64.png"))); // NOI18N
        btnBusca.setMnemonic(KeyEvent.VK_B);
        btnBusca.setActionCommand("Busca");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        lblDescBusca.setText("<html>Pesquisar clientes, veiculos, funcionarios, despachantes e financeiras</html>");

        lblBusca.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ico_categoria.png"))); // NOI18N
        lblBusca.setText("Busca ( ALT + B )");

        javax.swing.GroupLayout pn_buscaLayout = new javax.swing.GroupLayout(pn_busca);
        pn_busca.setLayout(pn_buscaLayout);
        pn_buscaLayout.setHorizontalGroup(
            pn_buscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_buscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_buscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(pn_buscaLayout.createSequentialGroup()
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_buscaLayout.setVerticalGroup(
            pn_buscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_buscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_buscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cachBox64x64.png"))); // NOI18N
        btnFinanceiro.setMnemonic(KeyEvent.VK_F);
        btnFinanceiro.setActionCommand("Financeiro");
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        lblDescFinanceiro.setText("<html>Lançamento de Receitas, Despesas, Pagamentos e Adiantamentos</html>");

        lblFinanceiro.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ico_categoria.png"))); // NOI18N
        lblFinanceiro.setText("Financeiro ( ALT + F )");

        javax.swing.GroupLayout pn_financeiroLayout = new javax.swing.GroupLayout(pn_financeiro);
        pn_financeiro.setLayout(pn_financeiroLayout);
        pn_financeiroLayout.setHorizontalGroup(
            pn_financeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_financeiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_financeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addGroup(pn_financeiroLayout.createSequentialGroup()
                        .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_financeiroLayout.setVerticalGroup(
            pn_financeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_financeiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFinanceiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_financeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnDocumentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/documentacao64x64.png"))); // NOI18N
        btnDocumentacao.setMnemonic(KeyEvent.VK_D);
        btnDocumentacao.setActionCommand("Documentacao");

        lblDescDocumentacao.setText("<html>Emissão de recibos, termo de garantia</html>");

        lblDocumentacao.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblDocumentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ico_categoria.png"))); // NOI18N
        lblDocumentacao.setText("Documentação ( ALT + D )");

        javax.swing.GroupLayout pn_documentacaoLayout = new javax.swing.GroupLayout(pn_documentacao);
        pn_documentacao.setLayout(pn_documentacaoLayout);
        pn_documentacaoLayout.setHorizontalGroup(
            pn_documentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_documentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_documentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDocumentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(pn_documentacaoLayout.createSequentialGroup()
                        .addComponent(btnDocumentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescDocumentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_documentacaoLayout.setVerticalGroup(
            pn_documentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_documentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDocumentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_documentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDocumentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescDocumentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pn_language.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha uma linguagem.:"));

        language_group.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Português");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        pn_language.add(jRadioButton1);

        language_group.add(jRadioButton3);
        jRadioButton3.setText("Inglês");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        pn_language.add(jRadioButton3);

        language_group.add(jRadioButton2);
        jRadioButton2.setText("Espanhol");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        pn_language.add(jRadioButton2);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDate.setText("Porto Alegre, Dia de Mês de Ano");

        lblHour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHour.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHour.setText("Hora: 00:00:00");

        javax.swing.GroupLayout pn_backgroundLayout = new javax.swing.GroupLayout(pn_background);
        pn_background.setLayout(pn_backgroundLayout);
        pn_backgroundLayout.setHorizontalGroup(
            pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_backgroundLayout.createSequentialGroup()
                .addComponent(header)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_backgroundLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_language, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_backgroundLayout.createSequentialGroup()
                        .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_financeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_documentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_backgroundLayout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_backgroundLayout.setVerticalGroup(
            pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_backgroundLayout.createSequentialGroup()
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_backgroundLayout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pn_financeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_documentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblHour))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(0, 0));

        mnConfiguracoes.setText("Configurações");

        setPasswordGerente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        setPasswordGerente.setText("Senha Gerente");
        setPasswordGerente.setFocusable(true);
        setPasswordGerente.setHideActionText(true);
        setPasswordGerente.setPreferredSize(new java.awt.Dimension(0, 0));
        setPasswordGerente.setVerifyInputWhenFocusTarget(false);
        setPasswordGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPasswordGerenteActionPerformed(evt);
            }
        });
        mnConfiguracoes.add(setPasswordGerente);

        jMenuBar1.add(mnConfiguracoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_background, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setDate() {
        Thread tread = new Thread() {
            Date date = new Date();
            public void run() {
                while (true) {
                    date.setTime(System.currentTimeMillis());
                    lblDate.setText((String) date.toFormat("'Porto Alegre,' dd 'de' MMMM 'de' yyyy"));
                    lblHour.setText((String) date.toFormat("'Hora:' HH:mm:ss"));
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        };

        tread.start();
    }

    private void setLanguage(String language) {
        ResourceBundle bundle = ResourceBundle.getBundle("view/extra/lingua_" + language);
        setTitle(bundle.getString("titulo"));
        lblDescCadastro.setText(bundle.getString("lblDescCadastro"));
        lblCadastro.setText(bundle.getString("lblCadastro"));
        btnBusca.setActionCommand(bundle.getString("btnBusca"));
        lblDescBusca.setText(bundle.getString("lblDescBusca"));
        lblBusca.setText(bundle.getString("lblBusca"));
        btnFinanceiro.setActionCommand(bundle.getString("btnFinanceiro"));
        lblDescFinanceiro.setText(bundle.getString("lblDescFinanceiro"));
        lblFinanceiro.setText(bundle.getString("lblFinanceiro"));
        btnDocumentacao.setActionCommand(bundle.getString("btnDocumentacao"));
        lblDescDocumentacao.setText(bundle.getString("lblDescDocumentacao"));
        lblDocumentacao.setText(bundle.getString("lblDocumentacao"));
        pn_language.setBorder(BorderFactory.createTitledBorder(bundle.getString("language")));
    }

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        ViewMDICadastro vc = new ViewMDICadastro();
        vc.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        ViewBuscas vb = new ViewBuscas();
        vb.setVisible(true);
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        setLanguage("pt_BR");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        setLanguage("en_US");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        setLanguage("es_ES");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        ViewFinanceiro vf = new ViewFinanceiro();
        vf.setVisible(true);
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void setPasswordGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPasswordGerenteActionPerformed
        dgp.setVisible(true);
    }//GEN-LAST:event_setPasswordGerenteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnDocumentacao;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JLabel header;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.ButtonGroup language_group;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescBusca;
    private javax.swing.JLabel lblDescCadastro;
    private javax.swing.JLabel lblDescDocumentacao;
    private javax.swing.JLabel lblDescFinanceiro;
    private javax.swing.JLabel lblDocumentacao;
    private javax.swing.JLabel lblFinanceiro;
    private javax.swing.JLabel lblHour;
    private javax.swing.JMenu mnConfiguracoes;
    private javax.swing.JPanel pn_background;
    private javax.swing.JPanel pn_busca;
    private javax.swing.JPanel pn_cadastro;
    private javax.swing.JPanel pn_documentacao;
    private javax.swing.JPanel pn_financeiro;
    private javax.swing.JPanel pn_language;
    private javax.swing.JMenuItem setPasswordGerente;
    // End of variables declaration//GEN-END:variables
}

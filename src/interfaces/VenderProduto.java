/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classeRestrCampo.SomenteNumeros;
import classes.CadastrarProduto;
import classes.Vendas;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class VenderProduto extends javax.swing.JFrame {

    /**
     * Creates new form VenderProduto
     */
    public VenderProduto() {
        initComponents();

        txtPesquisar.setEnabled(true);
        txtQuantidade.setEnabled(true);
        jBVender.setEnabled(true);
        txtQuantidade.setDocument(new SomenteNumeros());

        for (int i = 0; i < CadastrarProduto.cadastrarProduto.size(); i++) {
            DefaultTableModel dtm = (DefaultTableModel) jTPesquisa.getModel();
            dtm.addRow(new Object[]{CadastrarProduto.cadastrarProduto.get(i).getCodproduto(),
                CadastrarProduto.cadastrarProduto.get(i).getNome(),
                CadastrarProduto.cadastrarProduto.get(i).getQuantidade(),
                CadastrarProduto.cadastrarProduto.get(i).getPrecoAqui(),
                CadastrarProduto.cadastrarProduto.get(i).getPrecoVenda()});

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jBVender = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPesquisa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vender Produto"));

        jLabel1.setText("Quantidade: ");

        jBVender.setText("Vender");
        jBVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVenderActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar Produto: ");

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("Data Venda");

        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jBPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBVender, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVender)
                    .addComponent(jBPesquisar))
                .addGap(98, 98, 98))
        );

        jTPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Preço de aquisiçãol", "Preço de venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTPesquisa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        String pesquProduto = txtPesquisar.getText();
        limpaTabela();
        DefaultTableModel dtm = (DefaultTableModel) jTPesquisa.getModel();

        for (int i = 0; i < CadastrarProduto.cadastrarProduto.size(); i++) {
            if (CadastrarProduto.cadastrarProduto.get(i).getNome().contains(pesquProduto)) {
                int posi = i;

                dtm.addRow(new Object[]{CadastrarProduto.cadastrarProduto.get(posi).getCodproduto(),
                    CadastrarProduto.cadastrarProduto.get(posi).getNome(),
                    CadastrarProduto.cadastrarProduto.get(posi).getQuantidade(),
                    CadastrarProduto.cadastrarProduto.get(posi).getPrecoAqui(),
                    CadastrarProduto.cadastrarProduto.get(posi).getPrecoVenda()});
        }
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVenderActionPerformed

        int quantidade = Integer.parseInt(txtQuantidade.getText());
        String dataVenda = txtDataVenda.getText();
        boolean data = validarData(dataVenda);

        if (data) {
            for (int i = 0; i < CadastrarProduto.cadastrarProduto.size(); i++) {
                int mes;
                int ano;
                String nome;
                double valorVenda;
                double totalvenda = 0;
                int linha = jTPesquisa.getSelectedRow();

                int codSelecionado = Integer.parseInt(jTPesquisa.getValueAt(linha, 0).toString());

                if (codSelecionado == CadastrarProduto.cadastrarProduto.get(i).getCodproduto()) {
                    int posi = i;

                    int novaQtd = CadastrarProduto.cadastrarProduto.get(posi).getQuantidade() - quantidade;
                    valorVenda = CadastrarProduto.cadastrarProduto.get(posi).getPrecoVenda() * quantidade;
                    totalvenda += valorVenda;

                    int codProduVendido = CadastrarProduto.cadastrarProduto.get(posi).getCodproduto();
                    nome = CadastrarProduto.cadastrarProduto.get(posi).getNome();
                    mes = Integer.parseInt(dataVenda.substring(3,5));
                    ano = Integer.parseInt(dataVenda.substring(6,10));

                    Vendas vendas = new Vendas();
                    vendas.venda(codProduVendido, nome, quantidade, valorVenda, mes, ano, totalvenda);
                    Vendas.vendas.add(vendas);
                    CadastrarProduto.cadastrarProduto.get(posi).setQuantidade(novaQtd);
                    JOptionPane.showMessageDialog(rootPane, "Venda efetuada com sucesso!");

                }
            }
            limpaTabela();
            for (int i = 0; i < CadastrarProduto.cadastrarProduto.size(); i++) {

                DefaultTableModel dtm = (DefaultTableModel) jTPesquisa.getModel();

                dtm.addRow(new Object[]{CadastrarProduto.cadastrarProduto.get(i).getCodproduto(),
                    CadastrarProduto.cadastrarProduto.get(i).getNome(),
                    CadastrarProduto.cadastrarProduto.get(i).getQuantidade(),
                    CadastrarProduto.cadastrarProduto.get(i).getPrecoAqui(),
                    CadastrarProduto.cadastrarProduto.get(i).getPrecoVenda()});
        }
        }
    }//GEN-LAST:event_jBVenderActionPerformed
  public void limpaTabela() {
        DefaultTableModel dtm = (DefaultTableModel) jTPesquisa.getModel();
        dtm.setNumRows(0);

    }

    public boolean validarData(String s) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        try {
            df.parse(s);
            return true;
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data invalida!");
            txtDataVenda.setEnabled(true);
            txtPesquisar.setEnabled(true);
            txtQuantidade.setEnabled(true);
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VenderProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenderProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenderProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenderProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenderProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPesquisa;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}

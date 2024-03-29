/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classeRestrCampo.LimitarDigitos;
import classes.CadastrarFornecedor;
import classes.CadastrarFuncionario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class CadastroFornecedores extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFornecedores
     */
    public boolean alterar;

    public CadastroFornecedores() {
        initComponents();

        txtCnpj.setEnabled(false);
        txtNome.setEnabled(false);
        txtNomeFantasia.setEnabled(false);
        txtEmail.setEnabled(false);
        jBCadastrar.setEnabled(false);
        jBNovo.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtNomeFantasia.setDocument(new LimitarDigitos(40));
        txtEmail.setDocument(new LimitarDigitos(40));
        alterar = false;

        DefaultTableModel dtmProdutos = (DefaultTableModel) jTCadasFornecedor.getModel();
        for (int i = 0; i < CadastrarFornecedor.cadastrarFornecedor.size(); i++) {
            dtmProdutos.addRow(new Object[]{CadastrarFornecedor.cadastrarFornecedor.get(i).getCod(),
                CadastrarFornecedor.cadastrarFornecedor.get(i).getCnpj(),
                CadastrarFornecedor.cadastrarFornecedor.get(i).getNome(),
                CadastrarFornecedor.cadastrarFornecedor.get(i).getNomeFantasia(),
                CadastrarFornecedor.cadastrarFornecedor.get(i).getEmail()});

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jBNovo = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        txtCnpj = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCadasFornecedor = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Fornecedor"));

        jLabel1.setText("Nome: ");

        jLabel2.setText("Nome Fantasia: ");

        jLabel3.setText("CNPJ: ");

        jLabel4.setText("E-mail: ");

        txtNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFantasiaActionPerformed(evt);
            }
        });

        jBNovo.setBackground(new java.awt.Color(255, 51, 102));
        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBCadastrar.setBackground(new java.awt.Color(255, 51, 102));
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBAlterar.setBackground(new java.awt.Color(255, 51, 102));
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setBackground(new java.awt.Color(255, 51, 102));
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addComponent(txtNome)
                    .addComponent(txtNomeFantasia)
                    .addComponent(txtEmail)
                    .addComponent(txtCnpj))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBCadastrar)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTCadasFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTCadasFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "CNPJ", "Nome", "Nome Fantásia", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCadasFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTCadasFornecedorMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTCadasFornecedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public int gerarCodigo() {
        int cod = 1;
        for (int i = 0; i < CadastrarFornecedor.cadastrarFornecedor.size(); i++) {
            cod += 1;
        }
        return cod;
    }

    public boolean validarCNPJ(String cnpj) {
        boolean achou = false;
        for (int i = 0; i < CadastrarFornecedor.cadastrarFornecedor.size(); i++) {
            if (CadastrarFornecedor.cadastrarFornecedor.get(i).getCnpj().equals(cnpj)) {
                achou = true;
                JOptionPane.showMessageDialog(rootPane, "CNPJ já cadastrado");
                break;
            }
        }
        jBNovo.setEnabled(false);
        return achou;
    }

    public boolean emailRepetido(String email) {
        boolean achou = false;
        for (int j = 0; j < CadastrarFuncionario.cadastrarUsuario.size(); j++) {
            for (int i = 0; i < CadastrarFornecedor.cadastrarFornecedor.size(); i++) {
                if ((CadastrarFornecedor.cadastrarFornecedor.get(i).getEmail().equals(email))
                        || ((CadastrarFornecedor.cadastrarFornecedor.get(i).getEmail().equals(CadastrarFuncionario.cadastrarUsuario.get(j).getEmail())))) {
                    achou = true;
                    JOptionPane.showMessageDialog(rootPane, "E-mail já cadastrado");
                    break;
                }
            }
        }
        jBNovo.setEnabled(false);
        return achou;
    }

    public boolean validar_email(String email) {
        boolean validou = false;
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if (m.find()) {
            validou = true;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Email Invalido:");
            validou = false;

        }
        jBNovo.setEnabled(false);
        return validou;
    }
    private void txtNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFantasiaActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        txtCnpj.setEnabled(false);
        txtNome.setEnabled(false);
        txtNomeFantasia.setEnabled(false);
        txtEmail.setEnabled(false);
        jBCadastrar.setEnabled(false);
        jBNovo.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        if ((txtNome.getText().equals("")) || (txtNomeFantasia.getText().equals("")) || (txtNome.getText().equals("")) || (txtCnpj.getText().equals("  .   .   /    -  "))) {
            JOptionPane.showMessageDialog(rootPane, "Verificar campo em branco");
            txtCnpj.setEnabled(false);
            txtNome.setEnabled(false);
            txtNomeFantasia.setEnabled(false);
            txtEmail.setEnabled(false);
            jBCadastrar.setEnabled(false);
            jBNovo.setEnabled(true);
            jBAlterar.setEnabled(false);
            jBExcluir.setEnabled(false);
        } else {
            int cod = gerarCodigo();
            String nome = txtNome.getText();
            String nomeFantasia = txtNomeFantasia.getText();
            String email = txtEmail.getText();
            String cnpj = txtCnpj.getText();
            boolean achou = validarCNPJ(cnpj);
            boolean validou = validar_email(email);
            if (validou == true) {
                if (alterar == true) {
                    alterar = false;
                    int linhasel = jTCadasFornecedor.getSelectedRow();
                    CadastrarFornecedor.cadastrarFornecedor.get(linhasel).setCnpj(cnpj);
                    CadastrarFornecedor.cadastrarFornecedor.get(linhasel).setNome(nome);
                    CadastrarFornecedor.cadastrarFornecedor.get(linhasel).setNomeFantasia(nomeFantasia);
                    CadastrarFornecedor.cadastrarFornecedor.get(linhasel).setEmail(email);
                    jTCadasFornecedor.setValueAt(cnpj, linhasel, 1);
                    jTCadasFornecedor.setValueAt(nome, linhasel, 2);
                    jTCadasFornecedor.setValueAt(nomeFantasia, linhasel, 3);
                    jTCadasFornecedor.setValueAt(email, linhasel, 4);
                    JOptionPane.showMessageDialog(rootPane, "Dados Alterados Com Sucesso!");
                } else {
                    CadastrarFornecedor cadastrarFornecedor = new CadastrarFornecedor();
                    cadastrarFornecedor.cadastro(cod, nome, nomeFantasia, email, cnpj);
                    if (!achou) {
                        CadastrarFornecedor.cadastrarFornecedor.add(cadastrarFornecedor);
                        DefaultTableModel dtm = (DefaultTableModel) jTCadasFornecedor.getModel();

                        dtm.addRow(new Object[]{cod, cnpj, nome, nomeFantasia, email});

                        JOptionPane.showMessageDialog(rootPane, "Dados cadastrados com sucesso!");

                        txtCnpj.setEnabled(false);
                        txtNome.setEnabled(false);
                        txtNomeFantasia.setEnabled(false);
                        txtEmail.setEnabled(false);
                        jBCadastrar.setEnabled(false);
                        jBNovo.setEnabled(true);
                        jBAlterar.setEnabled(false);
                        jBExcluir.setEnabled(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        txtCnpj.setEnabled(true);
        txtNome.setEnabled(true);
        txtNomeFantasia.setEnabled(true);
        txtEmail.setEnabled(true);
        jBCadastrar.setEnabled(true);
        jBNovo.setEnabled(false);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtCnpj.setText("");
        txtEmail.setText("");
        txtNome.setText("");
        txtNomeFantasia.setText("");
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        jBNovo.setEnabled(false);
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtCnpj.setEnabled(true);
        txtNome.setEnabled(true);
        txtNomeFantasia.setEnabled(true);
        txtEmail.setEnabled(true);
        alterar = true;
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int excluir = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que quer excluir esse fornecedor", "Alerta", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            int posi = jTCadasFornecedor.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel) jTCadasFornecedor.getModel();
            dtm.removeRow(posi);
            CadastrarFornecedor.cadastrarFornecedor.remove(posi);
        }
        jBNovo.setEnabled(true);
        jBNovo.setEnabled(true);
        jBCadastrar.setEnabled(false);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtCnpj.setEnabled(false);
        txtEmail.setEnabled(false);
        txtNome.setEnabled(false);
        txtNomeFantasia.setEnabled(false);
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTCadasFornecedorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCadasFornecedorMouseReleased
        if (jTCadasFornecedor.getSelectedRow() != -1) {
            jBAlterar.setEnabled(true);
            jBExcluir.setEnabled(true);
            jBNovo.setEnabled(true);
            jBCadastrar.setEnabled(false);
            txtCnpj.setText("");
            txtNome.setText("");
            txtNomeFantasia.setText("");
            txtEmail.setText("");
            int linhasel = jTCadasFornecedor.getSelectedRow();
            txtCnpj.setText(jTCadasFornecedor.getValueAt(linhasel, 1).toString());
            txtNome.setText(jTCadasFornecedor.getValueAt(linhasel, 2).toString());
            txtNomeFantasia.setText(jTCadasFornecedor.getValueAt(linhasel, 3).toString());
            txtEmail.setText(jTCadasFornecedor.getValueAt(linhasel, 4).toString());
        }
    }//GEN-LAST:event_jTCadasFornecedorMouseReleased

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
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCadasFornecedor;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFantasia;
    // End of variables declaration//GEN-END:variables
}

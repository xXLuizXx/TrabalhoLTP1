/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classeRestrCampo.LimitarDigitos;
import classes.CadastrarFuncionario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    public boolean alterar;

    public CadastroFuncionario() {
        initComponents();
        
        jBNovo.setEnabled(true);
        jBCadastrar.setEnabled(false);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtNome.setEnabled(false);
        txtEmail.setEnabled(false);
        txtSenha.setEnabled(false);
        txtCpf.setEnabled(false);
        txtDataNasc.setEnabled(false);
        txtCargo.setEnabled(false);
        jCBSexo.setEnabled(false);
        txtNome.setDocument(new LimitarDigitos(40));
        txtEmail.setDocument(new LimitarDigitos(40));
        txtSenha.setDocument(new LimitarDigitos(20));
        txtCargo.setDocument(new LimitarDigitos(20));
        alterar = false;

        DefaultTableModel dtm = (DefaultTableModel) jTDadosUsuario.getModel();

        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            dtm.addRow(new Object[]{CadastrarFuncionario.cadastrarUsuario.get(i).getId(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getNome(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getCpf(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getEmail(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getSenha(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getCargo(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getPerm(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getSexo(),
            CadastrarFuncionario.cadastrarUsuario.get(i).getDataNasc()});
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
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jBCadastrar = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCBSexo = new javax.swing.JComboBox<>();
        txtDataNasc = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDadosUsuario = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Usuário"));

        jLabel1.setText("Nome: ");

        jLabel2.setText("CPF: ");

        jLabel3.setText("E-mail: ");

        jLabel4.setText("Senha: ");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jLabel5.setText("Cargo:");

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jLabel6.setText("Data Nascimento:");

        jLabel7.setText("Sexo:");

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtSenha)
                            .addComponent(txtDataNasc)
                            .addComponent(txtCpf)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtCargo)
                            .addComponent(jCBSexo, 0, 200, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBNovo)
                    .addComponent(jBExcluir)
                    .addComponent(jBAlterar))
                .addGap(13, 13, 13))
        );

        jTDadosUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Email", "Senha", "Cargo", "Permissão", "Sexo", "Data Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTDadosUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTDadosUsuarioMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTDadosUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public boolean validarData(String s) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        try {
            df.parse(s);
            return true;
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data invalida!");
            jBNovo.setEnabled(false);
            jBAlterar.setEnabled(false);
            jBExcluir.setEnabled(false);
            jBCadastrar.setEnabled(true);
            txtEmail.setEnabled(true);
            txtNome.setEnabled(true);
            txtSenha.setEnabled(true);
            txtDataNasc.setEnabled(true);
            txtCpf.setEnabled(true);
            txtCargo.setEnabled(true);
            txtDataNasc.setEnabled(true);
            jCBSexo.setEnabled(true);
            return false;
        }
    }

    public int gerarCodigo() {
        int cod = 1;
        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            cod += 1;
        }

        return cod;
    }

    public String gerarPermi() {
        String permi = "";
        int posi = CadastrarFuncionario.cadastrarUsuario.size();

        if (posi == 0) {
            permi = "Administrador";
        } else {
            permi = "Usuário Padrão";
        }
        return permi;
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
        jBCadastrar.setEnabled(true);
        return validou;
    }
    public boolean emailRepetido(String email) {
        boolean achou = false;
        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            if (CadastrarFuncionario.cadastrarUsuario.get(i).getEmail().equals(email)) {
                achou = true;
                JOptionPane.showMessageDialog(rootPane, "E-mail já cadastrado");
                break;
            }
        }
        return achou;
    }

    public boolean validarCPF(String cpf) {
        boolean achou = false;
        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            if (CadastrarFuncionario.cadastrarUsuario.get(i).getCpf().equals(cpf)) {
                achou = true;
                JOptionPane.showMessageDialog(rootPane, "CPF já cadastrado");
                break;
            }
        }
        return achou;
    }

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        int cod = gerarCodigo();
        jBCadastrar.setEnabled(false);
        jBNovo.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        if ((txtNome.getText().equals("")) || (txtCpf.getText().equals("   .   .   -  ")) || (txtSenha.getText().equals("")) || (txtEmail.getText().equals(""))) {
            JOptionPane.showMessageDialog(rootPane, "Verificar campos em branco");
            jBNovo.setEnabled(false);
            jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
            jBCadastrar.setEnabled(true);
            txtEmail.setEnabled(true);
            txtNome.setEnabled(true);
            txtSenha.setEnabled(true);
            txtDataNasc.setEnabled(true);
            txtCpf.setEnabled(true);
            txtCargo.setEnabled(true);
            jCBSexo.setEnabled(true);
        } else {

            String nome = txtNome.getText();
            String cpf = txtCpf.getText();
            String email = txtEmail.getText();
            String senha = txtSenha.getText();
            String cargo = txtCargo.getText();
            String permi = gerarPermi();
            String dataNasc = txtDataNasc.getText();
            String sexo = String.valueOf(jCBSexo.getSelectedItem());
            boolean achou = validarCPF(cpf);
            boolean achouEmail = emailRepetido(email);
            boolean validarData = validarData(dataNasc);
            boolean validou = validar_email(email);
            if (validou == true) {
                if (alterar == true) {
                    alterar = false;
                    int linhasel = jTDadosUsuario.getSelectedRow();
                    CadastrarFuncionario.cadastrarUsuario.get(linhasel).setNome(nome);
                    CadastrarFuncionario.cadastrarUsuario.get(linhasel).setCpf(cpf);
                    CadastrarFuncionario.cadastrarUsuario.get(linhasel).setEmail(email);
                    CadastrarFuncionario.cadastrarUsuario.get(linhasel).setSenha(senha);
                    CadastrarFuncionario.cadastrarUsuario.get(linhasel).setCargo(cargo);
                    CadastrarFuncionario.cadastrarUsuario.get(linhasel).setPerm(permi);
                    CadastrarFuncionario.cadastrarUsuario.get(linhasel).setSexo(sexo);
                    CadastrarFuncionario.cadastrarUsuario.get(linhasel).setDataNasc(dataNasc);
                    
                    jTDadosUsuario.setValueAt(nome, linhasel, 1);
                    jTDadosUsuario.setValueAt(cpf, linhasel, 2);
                    jTDadosUsuario.setValueAt(email, linhasel, 3);
                    jTDadosUsuario.setValueAt(senha, linhasel, 4);
                    jTDadosUsuario.setValueAt(cargo, linhasel, 5);
                    jTDadosUsuario.setValueAt(permi, linhasel, 6);
                    jTDadosUsuario.setValueAt(sexo, linhasel, 7);
                    jTDadosUsuario.setValueAt(dataNasc, linhasel, 8);
                    JOptionPane.showMessageDialog(rootPane, "Dados Alterados Com Sucesso:");

                } else {

                    CadastrarFuncionario cadastrarUsuario = new CadastrarFuncionario();
                    cadastrarUsuario.cadastro(cod, nome, cpf, email, senha, cargo, permi, sexo, dataNasc);

                    if ((!achou) && (!achouEmail) && (validarData)) {
                        CadastrarFuncionario.cadastrarUsuario.add(cadastrarUsuario);

                        DefaultTableModel dtm = (DefaultTableModel) jTDadosUsuario.getModel();
                        dtm.addRow(new Object[]{cod, nome, cpf, email, senha, cargo, permi, sexo, dataNasc});

                        JOptionPane.showMessageDialog(rootPane, "Dados cadastrados com sucesso");
                        jBNovo.setEnabled(true);
                        jBAlterar.setEnabled(false);
                        jBExcluir.setEnabled(false);
                        jBCadastrar.setEnabled(false);
                        txtEmail.setEnabled(false);
                        txtNome.setEnabled(false);
                        txtSenha.setEnabled(false);
                        txtDataNasc.setEnabled(false);
                        txtCpf.setEnabled(false);
                        txtCargo.setEnabled(false);
                        jCBSexo.setEnabled(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        jBNovo.setEnabled(false);
        jBCadastrar.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtEmail.setEnabled(true);
        txtNome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtCpf.setEnabled(true);
        txtCargo.setEnabled(true);
        txtDataNasc.setEnabled(true);
        jCBSexo.setEnabled(true);

        txtNome.setText("");
        txtSenha.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtCargo.setText("");
        txtDataNasc.setText("");

    }//GEN-LAST:event_jBNovoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        jBNovo.setEnabled(false);
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtNome.setEnabled(true);
        txtCpf.setEnabled(true);
        txtDataNasc.setEnabled(true);
        txtSenha.setEnabled(true);
        txtCargo.setEnabled(true);
        jCBSexo.setEnabled(true);
        txtEmail.setEnabled(true);
        alterar = true;
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int excluir = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que quer excluir esse funcionario", "Alerta", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            int posi = jTDadosUsuario.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel) jTDadosUsuario.getModel();
            dtm.removeRow(posi);
            CadastrarFuncionario.cadastrarUsuario.remove(posi);
        }
        jBNovo.setEnabled(true);
        jBCadastrar.setEnabled(false);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtNome.setEnabled(false);
        txtCpf.setEnabled(false);
        txtDataNasc.setEnabled(false);
        txtSenha.setEnabled(false);
        txtCargo.setEnabled(false);
        jCBSexo.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTDadosUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDadosUsuarioMouseReleased
        if (jTDadosUsuario.getSelectedRow() != -1) {
            jBAlterar.setEnabled(true);
            jBExcluir.setEnabled(true);
            jBNovo.setEnabled(true);
            jBCadastrar.setEnabled(false);
            txtNome.setEnabled(true);
            txtCpf.setEnabled(true);
            txtDataNasc.setEnabled(true);
            txtSenha.setEnabled(true);
            txtCargo.setEnabled(true);
            jCBSexo.setEnabled(true);
            txtEmail.setEnabled(true);
            int linhasel = jTDadosUsuario.getSelectedRow();
            txtNome.setText(jTDadosUsuario.getValueAt(linhasel, 1).toString());
            txtCpf.setText(jTDadosUsuario.getValueAt(linhasel, 2).toString());
            txtEmail.setText(jTDadosUsuario.getValueAt(linhasel, 3).toString());
            txtSenha.setText(jTDadosUsuario.getValueAt(linhasel, 4).toString());
            txtCargo.setText(jTDadosUsuario.getValueAt(linhasel, 5).toString());
            txtDataNasc.setText(jTDadosUsuario.getValueAt(linhasel, 8).toString());
        }
    }//GEN-LAST:event_jTDadosUsuarioMouseReleased

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JComboBox<String> jCBSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDadosUsuario;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}

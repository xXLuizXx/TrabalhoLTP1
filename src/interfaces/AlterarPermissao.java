/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.CadastrarFuncionario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class AlterarPermissao extends javax.swing.JFrame {

    /**
     * Creates new form AlterarPermissao
     */
    private boolean alterarPerm;

    public AlterarPermissao() {
        initComponents();
        DefaultTableModel dtm = (DefaultTableModel) jTAlterarPermi.getModel();
        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            dtm.addRow(new Object[]{CadastrarFuncionario.cadastrarUsuario.get(i).getId(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getNome(),
                CadastrarFuncionario.cadastrarUsuario.get(i).getPerm()});
        }
        alterarPerm = false;
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
        jBAlterarPermi = new javax.swing.JButton();
        txtPermi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlterarPermi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar Permissão"));

        jLabel1.setText("Permissão:");

        jBAlterarPermi.setText("Alterar");
        jBAlterarPermi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarPermiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPermi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBAlterarPermi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPermi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jBAlterarPermi)
                .addGap(24, 24, 24))
        );

        jTAlterarPermi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Permissão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAlterarPermi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTAlterarPermiMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTAlterarPermi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean permiValida(String permiDigitada) {
        boolean valida = false;
        if ((permiDigitada.equals("Administrador"))||(permiDigitada.equals("Usuário Padrão"))) {
           valida = true;
        }else{
            JOptionPane.showMessageDialog(rootPane, "Permi Invalida!");
            JOptionPane.showMessageDialog(rootPane, "Os tipos de permissões validas são (Administrador) ou (Usuário Padrão)");
        }
        return valida;
    }
    private void jTAlterarPermiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAlterarPermiMouseReleased
        if (jTAlterarPermi.getSelectedRow() != -1) {
            int linhasel = jTAlterarPermi.getSelectedRow();
            txtPermi.setText(jTAlterarPermi.getValueAt(linhasel, 2).toString());
        }
    }//GEN-LAST:event_jTAlterarPermiMouseReleased

    private void jBAlterarPermiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarPermiActionPerformed
        alterarPerm = true;
        String permi = "";
        permi = txtPermi.getText();
        boolean permiVali = permiValida(permi);
        if ((alterarPerm == true)&&(permiVali)) {
            int linhasel = jTAlterarPermi.getSelectedRow();
            CadastrarFuncionario.cadastrarUsuario.get(linhasel).setPerm(permi);
            jTAlterarPermi.setValueAt(permi, linhasel, 2);
            JOptionPane.showMessageDialog(rootPane, "Permissão alterada com sucesso!");
        }
    }//GEN-LAST:event_jBAlterarPermiActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarPermissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarPermissao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarPermi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlterarPermi;
    private javax.swing.JTextField txtPermi;
    // End of variables declaration//GEN-END:variables
}

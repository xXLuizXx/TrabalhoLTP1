/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Relatorios.RelatorioVendas;
import classes.CadastrarFornecedor;
import classes.CadastrarFuncionario;
import classes.CadastrarProduto;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private int codLogin;

    public Principal(int cod) {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        codLogin = cod;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMUsuarios = new javax.swing.JMenu();
        jMIPerfil = new javax.swing.JMenuItem();
        jMIGerenciarUsu = new javax.swing.JMenuItem();
        jMFornecedores = new javax.swing.JMenu();
        jMIGerenciarForne = new javax.swing.JMenuItem();
        jMProdutos = new javax.swing.JMenu();
        jMIGerenciarProd = new javax.swing.JMenuItem();
        jMVendas = new javax.swing.JMenu();
        jMIEfeVenda = new javax.swing.JMenuItem();
        jMRelatorio = new javax.swing.JMenu();
        jMIRelatVendas = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();
        jM1Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SimpleStock.jpg"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 255));

        jMUsuarios.setText("Usuarios");

        jMIPerfil.setText("Perfil");
        jMIPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPerfilActionPerformed(evt);
            }
        });
        jMUsuarios.add(jMIPerfil);

        jMIGerenciarUsu.setText("Gerenciar Usuários");
        jMIGerenciarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGerenciarUsuActionPerformed(evt);
            }
        });
        jMUsuarios.add(jMIGerenciarUsu);

        jMenuBar1.add(jMUsuarios);

        jMFornecedores.setText("Fornecedores");

        jMIGerenciarForne.setText("Gerenciar Fornecedores");
        jMIGerenciarForne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGerenciarForneActionPerformed(evt);
            }
        });
        jMFornecedores.add(jMIGerenciarForne);

        jMenuBar1.add(jMFornecedores);

        jMProdutos.setText("Produtos");

        jMIGerenciarProd.setText("Gerenciar Produtos");
        jMIGerenciarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGerenciarProdActionPerformed(evt);
            }
        });
        jMProdutos.add(jMIGerenciarProd);

        jMenuBar1.add(jMProdutos);

        jMVendas.setText("Vendas");

        jMIEfeVenda.setText("Efetuar Venda");
        jMIEfeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEfeVendaActionPerformed(evt);
            }
        });
        jMVendas.add(jMIEfeVenda);

        jMenuBar1.add(jMVendas);

        jMRelatorio.setText("Relatório");

        jMIRelatVendas.setText("Vendas");
        jMIRelatVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRelatVendasActionPerformed(evt);
            }
        });
        jMRelatorio.add(jMIRelatVendas);

        jMenuBar1.add(jMRelatorio);

        Sair.setText("Sair");

        jM1Sair.setText("Sair");
        jM1Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM1SairActionPerformed(evt);
            }
        });
        Sair.add(jM1Sair);

        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean validarAdm(int cod) {
        boolean adm = false;
        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            if (CadastrarFuncionario.cadastrarUsuario.get(i).getId() == cod) {
                int posi = i;
                if (CadastrarFuncionario.cadastrarUsuario.get(posi).getPerm().equals("Administrador")) {
                    adm = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar essa tela!");
                    adm = false;
                }
            }

        }
        return adm;
    }
    private void jMIGerenciarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGerenciarProdActionPerformed
        CadastroProduto cadastroProduto = new CadastroProduto();
        if (CadastrarFornecedor.cadastrarFornecedor.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Cadastre um fornecedor antes de cadastrar um produto");
        }else{
            for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
                if (validarAdm(codLogin)) {
                    cadastroProduto.setVisible(true);
                    break;
                } else {
                    cadastroProduto.setVisible(false);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jMIGerenciarProdActionPerformed

    private void jMIGerenciarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGerenciarUsuActionPerformed
        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            if (validarAdm(codLogin)) {
                CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
                cadastroFuncionario.setVisible(true);
                break;
            } else {
                CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
                cadastroFuncionario.setVisible(false);
                break;
            }
        }

    }//GEN-LAST:event_jMIGerenciarUsuActionPerformed

    private void jMIGerenciarForneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGerenciarForneActionPerformed
        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            if (validarAdm(codLogin)) {
                CadastroFornecedores cadastroFornecedores = new CadastroFornecedores();
                cadastroFornecedores.setVisible(true);
                break;
            } else {
                CadastroFornecedores cadastroFornecedores = new CadastroFornecedores();
                cadastroFornecedores.setVisible(false);
                break;
            }
        }
    }//GEN-LAST:event_jMIGerenciarForneActionPerformed

    private void jMIEfeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEfeVendaActionPerformed
        VenderProduto retirarProduto = new VenderProduto();
        retirarProduto.setVisible(true);
    }//GEN-LAST:event_jMIEfeVendaActionPerformed

    private void jMIPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPerfilActionPerformed

        Perfil perfil = new Perfil(codLogin);
        perfil.setVisible(true);
    }//GEN-LAST:event_jMIPerfilActionPerformed

    private void jMIRelatVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRelatVendasActionPerformed
        for (int i = 0; i < CadastrarFuncionario.cadastrarUsuario.size(); i++) {
            if (validarAdm(codLogin)) {
                RelatorioVendas relatorioVendas = new RelatorioVendas();
                relatorioVendas.setVisible(true);
                break;
            } else {
                RelatorioVendas relatorioVendas = new RelatorioVendas();
                relatorioVendas.setVisible(false);
                break;
            }
        }
    }//GEN-LAST:event_jMIRelatVendasActionPerformed

    private void jM1SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM1SairActionPerformed
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jM1SairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Sair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jM1Sair;
    private javax.swing.JMenu jMFornecedores;
    private javax.swing.JMenuItem jMIEfeVenda;
    private javax.swing.JMenuItem jMIGerenciarForne;
    private javax.swing.JMenuItem jMIGerenciarProd;
    private javax.swing.JMenuItem jMIGerenciarUsu;
    private javax.swing.JMenuItem jMIPerfil;
    private javax.swing.JMenuItem jMIRelatVendas;
    private javax.swing.JMenu jMProdutos;
    private javax.swing.JMenu jMRelatorio;
    private javax.swing.JMenu jMUsuarios;
    private javax.swing.JMenu jMVendas;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relatorios;

import classes.Vendas;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class RelatorioVendas extends javax.swing.JFrame {

    /**
     * Creates new form RelatorioVendas
     */
    public RelatorioVendas() {
        initComponents();
        jBGerarRela.setEnabled(false);
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
        jCheckBLucroVendas = new javax.swing.JCheckBox();
        jCheckBQtdVendasAno = new javax.swing.JCheckBox();
        jCheckBQtdVendasMes = new javax.swing.JCheckBox();
        jBGerarRela = new javax.swing.JButton();
        jBProcurarDiretorio = new javax.swing.JButton();
        txtCaminho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório de Vendas"));

        jCheckBLucroVendas.setText("Lucro de vendas");

        jCheckBQtdVendasAno.setText("Quantidade de produtos vendidos no ano");

        jCheckBQtdVendasMes.setText(" Quantidade de produtos vendidos no mês");

        jBGerarRela.setText("Gerar Relatório");
        jBGerarRela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerarRelaActionPerformed(evt);
            }
        });

        jBProcurarDiretorio.setText("Procurar Diretorio");
        jBProcurarDiretorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProcurarDiretorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBQtdVendasMes)
                            .addComponent(jCheckBQtdVendasAno)
                            .addComponent(jCheckBLucroVendas))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBGerarRela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCaminho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBProcurarDiretorio)))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jCheckBLucroVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBQtdVendasAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBQtdVendasMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBProcurarDiretorio)
                    .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBGerarRela)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBGerarRelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarRelaActionPerformed
        Document documentPDF = new Document();
        String prencherNulo = "";
        String codi = "";
        String nomePro = "";
        String quantidade = "";
        String valorVenda = "";
        String mesDaVenda = "";
        String anoDaVenda = "";
        String valorGasto = "";
        String lucro = "";
        
        try {
            PdfWriter.getInstance(documentPDF, new FileOutputStream(txtCaminho.getText() + "//Relatório de vendas.pdf"));
            PdfPTable tableCa = new PdfPTable(8);
            PdfPTable table = new PdfPTable(8);
            documentPDF.open();
            documentPDF.newPage();
            documentPDF.setPageSize(PageSize.A4);
            Font fonte = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
            Paragraph cab = new Paragraph("\n RELATÓRIO DE VENDAS ", fonte);
            cab.setAlignment(Element.ALIGN_CENTER);
            documentPDF.add(cab);
            documentPDF.add(new Paragraph("\n"));
            documentPDF.add(new Paragraph("\n"));
            documentPDF.add(new Paragraph("\n"));
        
            for (int i = 0; i < Vendas.vendas.size(); i++) {
                codi = String.valueOf(Vendas.vendas.get(i).getCodProdutoVendido());
                nomePro = Vendas.vendas.get(i).getNome();
                quantidade = String.valueOf(Vendas.vendas.get(i).getQuantidade());
                valorVenda = String.valueOf(Vendas.vendas.get(i).getValorVenda());
                mesDaVenda = String.valueOf(Vendas.vendas.get(i).getMes());
                anoDaVenda = String.valueOf(Vendas.vendas.get(i).getAno());
                valorGasto = String.valueOf(Vendas.vendas.get(i).getValorGasto());
                lucro = String.valueOf(Vendas.vendas.get(i).getLucro());

                PdfPCell codC = new PdfPCell(new Paragraph(codi));
                PdfPCell nomeC = new PdfPCell(new Paragraph(nomePro));
                PdfPCell qtdC = new PdfPCell(new Paragraph(quantidade));
                PdfPCell valorC = new PdfPCell(new Paragraph(valorVenda));
                PdfPCell mesVendaC = new PdfPCell(new Paragraph(mesDaVenda));
                PdfPCell anoVendaC = new PdfPCell(new Paragraph(anoDaVenda));
                PdfPCell valorGastoC = new PdfPCell(new Paragraph(valorGasto));
                PdfPCell lucrovendasC = new PdfPCell(new Paragraph(lucro));

                if ((jCheckBLucroVendas.isSelected()) && (jCheckBQtdVendasAno.isSelected()) && (jCheckBQtdVendasMes.isSelected())) {
                    PdfPCell cod = new PdfPCell(new Paragraph("Código"));
                    PdfPCell nome = new PdfPCell(new Paragraph("Nome"));
                    PdfPCell qtd = new PdfPCell(new Paragraph("Quantidade"));
                    PdfPCell valor = new PdfPCell(new Paragraph("Valor venda"));
                    PdfPCell mesVenda = new PdfPCell(new Paragraph("Mês venda"));
                    PdfPCell anoVenda = new PdfPCell(new Paragraph("Ano venda"));
                    PdfPCell valorGas = new PdfPCell(new Paragraph("Valor gasto"));
                    PdfPCell lucrovendas = new PdfPCell(new Paragraph("Lucro de Vendas"));

                    tableCa.addCell(cod);
                    tableCa.addCell(nome);
                    tableCa.addCell(qtd);
                    tableCa.addCell(valor);
                    tableCa.addCell(mesVenda);
                    tableCa.addCell(anoVenda);
                    tableCa.addCell(valorGas);
                    tableCa.addCell(lucrovendas);

                    table.addCell(codC);
                    table.addCell(nomeC);
                    table.addCell(qtdC);
                    table.addCell(valorC);
                    table.addCell(mesVendaC);
                    table.addCell(anoVendaC);
                    table.addCell(valorGastoC);
                    table.addCell(lucrovendasC);

                    //documentPDF.add(table);
                    break;
                } else if ((jCheckBLucroVendas.isSelected()) && (jCheckBQtdVendasAno.isSelected())) {
                    PdfPCell cod = new PdfPCell(new Paragraph("Código"));
                    PdfPCell nome = new PdfPCell(new Paragraph("Nome"));
                    PdfPCell qtd = new PdfPCell(new Paragraph("Quantidade"));
                    PdfPCell valor = new PdfPCell(new Paragraph("Valor venda"));
                    PdfPCell anoVenda = new PdfPCell(new Paragraph("Ano venda"));
                    PdfPCell lucrovendas = new PdfPCell(new Paragraph("Lucro de Vendas"));

                    tableCa.addCell(cod);
                    tableCa.addCell(nome);
                    tableCa.addCell(qtd);
                    tableCa.addCell(valor);
                    tableCa.addCell(anoVenda);
                    tableCa.addCell(lucrovendas);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);

                    table.addCell(codC);
                    table.addCell(nomeC);
                    table.addCell(qtdC);
                    table.addCell(valorC);
                    table.addCell(anoVendaC);
                    table.addCell(lucrovendasC);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);

                    //documentPDF.add(table);
                    break;
                } else if ((jCheckBLucroVendas.isSelected()) && (jCheckBQtdVendasMes.isSelected())) {
                    PdfPCell cod = new PdfPCell(new Paragraph("Código"));
                    PdfPCell nome = new PdfPCell(new Paragraph("Nome"));
                    PdfPCell qtd = new PdfPCell(new Paragraph("Quantidade"));
                    PdfPCell valor = new PdfPCell(new Paragraph("Valor venda"));
                    PdfPCell mesVenda = new PdfPCell(new Paragraph("Mês venda"));
                    PdfPCell lucrovendas = new PdfPCell(new Paragraph("Lucro de Vendas"));

                    tableCa.addCell(cod);
                    tableCa.addCell(nome);
                    tableCa.addCell(qtd);
                    tableCa.addCell(valor);
                    tableCa.addCell(mesVenda);
                    tableCa.addCell(lucrovendas);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);

                    table.addCell(codC);
                    table.addCell(nomeC);
                    table.addCell(qtdC);
                    table.addCell(valorC);
                    table.addCell(mesVendaC);
                    table.addCell(lucrovendasC);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);

                    //documentPDF.add(table);
                    break;
                } else if ((jCheckBQtdVendasAno.isSelected()) && (jCheckBQtdVendasMes.isSelected())) {
                    PdfPCell cod = new PdfPCell(new Paragraph("Código"));
                    PdfPCell nome = new PdfPCell(new Paragraph("Nome"));
                    PdfPCell qtd = new PdfPCell(new Paragraph("Quantidade"));
                    PdfPCell mesVenda = new PdfPCell(new Paragraph("Mês venda"));

                    tableCa.addCell(cod);
                    tableCa.addCell(nome);
                    tableCa.addCell(qtd);
                    tableCa.addCell(mesVenda);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);

                    table.addCell(codC);
                    table.addCell(nomeC);
                    table.addCell(qtdC);
                    table.addCell(mesVendaC);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);

                    //documentPDF.add(table);
                    break;
                } else if (jCheckBLucroVendas.isSelected()) {
                    PdfPCell lucrovendas = new PdfPCell(new Paragraph("Lucro de Vendas"));

                    tableCa.addCell(lucrovendas);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);

                    table.addCell(lucrovendasC);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);

                    //documentPDF.add(table);
                    break;
                } else if (jCheckBQtdVendasAno.isSelected()) {
                    PdfPCell cod = new PdfPCell(new Paragraph("Código"));
                    PdfPCell nome = new PdfPCell(new Paragraph("Nome"));
                    PdfPCell qtd = new PdfPCell(new Paragraph("Quantidade"));
                    PdfPCell mesVenda = new PdfPCell(new Paragraph("Mês venda"));

                    tableCa.addCell(cod);
                    tableCa.addCell(nome);
                    tableCa.addCell(qtd);
                    tableCa.addCell(mesVenda);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);

                    table.addCell(codC);
                    table.addCell(nomeC);
                    table.addCell(qtdC);
                    table.addCell(mesVendaC);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);

                    //documentPDF.add(table);
                    break;
                } else if (jCheckBQtdVendasMes.isSelected()) {
                    PdfPCell cod = new PdfPCell(new Paragraph("Código"));
                    PdfPCell nome = new PdfPCell(new Paragraph("Nome"));
                    PdfPCell qtd = new PdfPCell(new Paragraph("Quantidade"));
                    PdfPCell anoVenda = new PdfPCell(new Paragraph("Ano venda"));

                    tableCa.addCell(cod);
                    tableCa.addCell(nome);
                    tableCa.addCell(qtd);
                    tableCa.addCell(anoVenda);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);
                    tableCa.addCell(prencherNulo);

                    table.addCell(codC);
                    table.addCell(nomeC);
                    table.addCell(qtdC);
                    table.addCell(anoVendaC);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);
                    table.addCell(prencherNulo);

                    //documentPDF.add(table);
                    break;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Nenhum tipo de relatório selecionado");
                    break;
                }
            }
            
            documentPDF.add(tableCa);
            
            for (int i = 0; i < Vendas.vendas.size(); i++) {
                documentPDF.add(table);
            }
            
        } catch (DocumentException de) {
            de.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            documentPDF.close();
            JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!");
        }

    }//GEN-LAST:event_jBGerarRelaActionPerformed

    private void jBProcurarDiretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProcurarDiretorioActionPerformed
        jBGerarRela.setEnabled(true);
        JFileChooser local = new JFileChooser();
        local.setDialogTitle("Selecione a pasta");
        local.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int opcao = local.showOpenDialog(this);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            File file = new File("caminho");
            file = local.getSelectedFile();
            String caminho = file.getAbsolutePath();
            txtCaminho.setText(caminho);
        }
    }//GEN-LAST:event_jBProcurarDiretorioActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGerarRela;
    private javax.swing.JButton jBProcurarDiretorio;
    private javax.swing.JCheckBox jCheckBLucroVendas;
    private javax.swing.JCheckBox jCheckBQtdVendasAno;
    private javax.swing.JCheckBox jCheckBQtdVendasMes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCaminho;
    // End of variables declaration//GEN-END:variables
}

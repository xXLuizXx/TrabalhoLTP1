/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classeRestrCampo.AceitarPonto;
import classeRestrCampo.LimitarDigitos;
import classeRestrCampo.SomenteNumeros;
import classes.CadastrarFornecedor;
import classes.CadastrarProduto;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PAULO
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProduto
     */
    public boolean alterar;

    public int vetor[] = new int[CadastrarFornecedor.cadastrarFornecedor.size()];

    public CadastroProduto() {
        initComponents();
        
        jBNovo.setEnabled(true);
        jBCadastrar.setEnabled(false);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtNome.setEnabled(false);
        txtMarca.setEnabled(false);
        txtDataAqui.setEnabled(false);
        txtTPrAquisi.setEnabled(false);
        txtTPrAquisi.setDocument(new AceitarPonto());
        txtPreVenda.setEnabled(false);
        txtPreVenda.setDocument(new AceitarPonto());
        txtUnidaMedida.setEnabled(false);
        txtQuantidade.setEnabled(false);
        jCBFornecedores.setEnabled(false);
        txtQuantidade.setDocument(new SomenteNumeros());
        txtNome.setDocument(new LimitarDigitos(40));
        txtMarca.setDocument(new LimitarDigitos(40));

        alterar = false;
        DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutos.getModel();
        for (int i = 0; i < CadastrarProduto.cadastrarProduto.size(); i++) {
            dtmProdutos.addRow(new Object[]{CadastrarProduto.cadastrarProduto.get(i).getCodproduto(),
                CadastrarProduto.cadastrarProduto.get(i).getNome(),
                CadastrarProduto.cadastrarProduto.get(i).getMarca(),
                CadastrarProduto.cadastrarProduto.get(i).getPeso(),
                CadastrarProduto.cadastrarProduto.get(i).getPrecoAqui(),
                CadastrarProduto.cadastrarProduto.get(i).getPrecoVenda(),
                CadastrarProduto.cadastrarProduto.get(i).getQuantidade(),
                CadastrarProduto.cadastrarProduto.get(i).getCodfornecedor(),
                CadastrarProduto.cadastrarProduto.get(i).getDataAqui()});
        }

        jCBFornecedores.addItem("Selecione");
        for (int i = 0; i < CadastrarFornecedor.cadastrarFornecedor.size(); i++) {
            jCBFornecedores.addItem(CadastrarFornecedor.cadastrarFornecedor.get(i).getNomeFantasia());
            vetor[i] = CadastrarFornecedor.cadastrarFornecedor.get(i).getCod();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtTPrAquisi = new javax.swing.JTextField();
        jBNovo = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        Preco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBFornecedores = new javax.swing.JComboBox<>();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtUnidaMedida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPreVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDataAqui = new javax.swing.JFormattedTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro De Produto"));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
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

        Nome.setText("Nome:");

        Marca.setText("Marca:");

        Preco.setText("Preço Aquisição:");

        jLabel1.setText("Quantidade:");

        jLabel2.setText("Fornecedor:");

        jCBFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFornecedoresActionPerformed(evt);
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

        jLabel3.setText("Peso/Litros/comprimento:");

        jLabel4.setText("Preço Venda:");

        jLabel5.setText("Data Aquisição:");

        try {
            txtDataAqui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataAqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataAquiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(Marca)
                            .addComponent(Nome)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMarca)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUnidaMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Preco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTPrAquisi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBFornecedores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPreVenda))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantidade)
                            .addComponent(txtDataAqui, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUnidaMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preco)
                    .addComponent(txtTPrAquisi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtPreVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCBFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataAqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBCadastrar)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir))
                .addContainerGap())
        );

        jTProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Marca", "Peso", "Preço Aquisição", "Preço Venda", "Quantidade", "Fornecedor", "Data Aquisição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTProdutosMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        // TODO add your handling code here:
        jBNovo.setEnabled(false);
        jBCadastrar.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtNome.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtMarca.setEnabled(true);
        txtUnidaMedida.setEnabled(true);
        txtDataAqui.setEnabled(true);
        txtPreVenda.setEnabled(true);
        txtTPrAquisi.setEnabled(true);
        jCBFornecedores.setEnabled(true);
        txtNome.setText("");
        txtMarca.setText("");
        txtQuantidade.setText("");
        txtTPrAquisi.setText("");
        txtDataAqui.setText("");
        txtPreVenda.setText("");
        txtTPrAquisi.setText("");
        txtUnidaMedida.setText("");
    }//GEN-LAST:event_jBNovoActionPerformed

    public double calcularTotalGasto() {
        double totalGasto = 0;
        for (int i = 0; i < CadastrarProduto.cadastrarProduto.size(); i++) {
            totalGasto += (CadastrarProduto.cadastrarProduto.get(i).getPrecoAqui() * CadastrarProduto.cadastrarProduto.get(i).getQuantidade());
        }
        return totalGasto;
    }

    public int gerar_codigo() {
        int cod = 1;
        for (int i = 0; i < CadastrarProduto.cadastrarProduto.size(); i++) {
            cod += 1;
        }
        return cod;
    }

    public boolean validarData(String s) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        try {
            df.parse(s);
            return true;
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data invalida!");

            jBNovo.setEnabled(false);
            jBCadastrar.setEnabled(true);
            jBAlterar.setEnabled(false);
            jBExcluir.setEnabled(false);
            txtNome.setEnabled(true);
            txtMarca.setEnabled(true);
            txtUnidaMedida.setEnabled(true);
            txtPreVenda.setEnabled(true);
            txtQuantidade.setEnabled(true);
            txtTPrAquisi.setEnabled(true);
            return false;
        }
    }
    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        // TODO add your handling code here:
        jBCadastrar.setEnabled(false);
        jBNovo.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        if (txtNome.getText().equals("") || txtMarca.getText().equals("") || txtQuantidade.getText().equals("")
                || txtTPrAquisi.getText().equals("") || (txtUnidaMedida.getText().equals("")) || (txtPreVenda.getText().equals("")) || (jCBFornecedores.getSelectedItem().equals("")) || (txtDataAqui.getText().equals("  /  /    "))) {
            JOptionPane.showMessageDialog(rootPane, "Verificar campos em branco: ");
            jBNovo.setEnabled(false);
            jBCadastrar.setEnabled(true);
            jBAlterar.setEnabled(false);
            jBExcluir.setEnabled(false);
            txtNome.setEnabled(true);
            txtUnidaMedida.setEnabled(true);
            txtPreVenda.setEnabled(true);
            txtQuantidade.setEnabled(true);
            txtMarca.setEnabled(true);
            txtTPrAquisi.setEnabled(true);
            txtDataAqui.setEnabled(false);
            jCBFornecedores.setEnabled(false);
        } else {
            int cod = gerar_codigo();
            String nome = txtNome.getText();
            String marca = txtMarca.getText();
            String dataAqui = txtDataAqui.getText();
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            double precoAquisi = Double.parseDouble(txtTPrAquisi.getText());
            double precoDeVenda = Double.parseDouble(txtPreVenda.getText());
            
            DecimalFormat df = new DecimalFormat("#,###.00");
            
            String precoAq = df.format(precoAquisi);
            String precoVen = df.format(precoDeVenda);
            
            double precoAqui = Double.parseDouble(precoAq);
            double precoVenda = Double.parseDouble(precoVen);
            String unidadeMedida = txtUnidaMedida.getText();
            String fornecedor = "";
            int indexfornecedor = 0;
            int codfornecedor = 0;
            boolean data = validarData(dataAqui);
            int mes;
            int ano;

            if ((alterar == true) && (data)) {
                alterar = false;
                int linhasel = jTProdutos.getSelectedRow();
                CadastrarProduto.cadastrarProduto.get(linhasel).setNome(nome);
                CadastrarProduto.cadastrarProduto.get(linhasel).setMarca(marca);
                CadastrarProduto.cadastrarProduto.get(linhasel).setUnidadeMedida(unidadeMedida);
                CadastrarProduto.cadastrarProduto.get(linhasel).setPrecoAqui(precoAqui);
                CadastrarProduto.cadastrarProduto.get(linhasel).setPrecoVenda(precoVenda);
                CadastrarProduto.cadastrarProduto.get(linhasel).setQuantidade(quantidade);
                CadastrarProduto.cadastrarProduto.get(linhasel).setCodfornecedor(codfornecedor);
                CadastrarProduto.cadastrarProduto.get(linhasel).setDataAqui(dataAqui);
                jTProdutos.setValueAt(nome, linhasel, 1);
                jTProdutos.setValueAt(marca, linhasel, 2);
                jTProdutos.setValueAt(unidadeMedida, linhasel, 3);
                jTProdutos.setValueAt(precoAqui, linhasel, 4);
                jTProdutos.setValueAt(precoVenda, linhasel, 5);
                jTProdutos.setValueAt(quantidade, linhasel, 6);
                jTProdutos.setValueAt(fornecedor, linhasel, 7);
                jTProdutos.setValueAt(dataAqui, linhasel, 8);
                JOptionPane.showMessageDialog(rootPane, "Dados Alterados Com Sucesso:");
            } else {
                for (int i = 0; i < CadastrarFornecedor.cadastrarFornecedor.size(); i++) {
                    indexfornecedor = Integer.valueOf(jCBFornecedores.getSelectedIndex());
                    if (indexfornecedor == vetor[i]) {
                        codfornecedor = vetor[i];
                        fornecedor = CadastrarFornecedor.cadastrarFornecedor.get(i).getNomeFantasia();
                    }
                }
                mes = Integer.parseInt(dataAqui.substring(3, 5));
                ano = Integer.parseInt(dataAqui.substring(6, 10));
                double valorTotalGasto = calcularTotalGasto();
                CadastrarProduto cadastrarProduto = new CadastrarProduto();
                cadastrarProduto.cadastro(cod, nome, quantidade, marca, unidadeMedida, precoAqui, precoVenda, codfornecedor, dataAqui, mes, ano, valorTotalGasto);
                if (data) {
                    CadastrarProduto.cadastrarProduto.add(cadastrarProduto);
                    DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutos.getModel();
                    dtmProdutos.addRow(new Object[]{cod, nome, marca, unidadeMedida, precoAqui, precoVenda, quantidade, fornecedor, dataAqui});

                    JOptionPane.showMessageDialog(rootPane, "Dados Cadastrados Com Sucesso:");

                    jBNovo.setEnabled(true);
                    jBCadastrar.setEnabled(false);
                    jBAlterar.setEnabled(false);
                    jBExcluir.setEnabled(false);
                    txtNome.setEnabled(false);
                    txtQuantidade.setEnabled(false);
                    txtMarca.setEnabled(false);
                    txtUnidaMedida.setEnabled(false);
                    txtPreVenda.setEnabled(false);
                    txtTPrAquisi.setEnabled(false);
                    txtDataAqui.setEnabled(false);
                    jCBFornecedores.setEnabled(false);
                }
            }
        }

    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jCBFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFornecedoresActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int excluir = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que desenja excluir esse produto", "Alerta", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_NO_OPTION) {
            int posi = jTProdutos.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel) jTProdutos.getModel();
            dtm.removeRow(posi);
            CadastrarProduto.cadastrarProduto.remove(posi);
        }
        jBNovo.setEnabled(true);
        jBCadastrar.setEnabled(false);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtNome.setEnabled(false);
        txtMarca.setEnabled(false);
        txtUnidaMedida.setEnabled(false);
        txtPreVenda.setEnabled(false);
        txtQuantidade.setEnabled(false);
        txtTPrAquisi.setEnabled(false);
        jCBFornecedores.setEnabled(false);
        txtDataAqui.setEnabled(false);
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        jBNovo.setEnabled(false);
        jBCadastrar.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBExcluir.setEnabled(false);
        txtNome.setEnabled(true);
        txtMarca.setEnabled(true);
        txtUnidaMedida.setEnabled(true);
        txtPreVenda.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtTPrAquisi.setEnabled(true);
        jCBFornecedores.setEnabled(true);
        txtDataAqui.setEnabled(true);
        alterar = true;
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jTProdutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseReleased
        if (jTProdutos.getSelectedRow() != -1) {
            jBAlterar.setEnabled(true);
            jBExcluir.setEnabled(true);
            jBNovo.setEnabled(true);
            jBCadastrar.setEnabled(false);
            txtNome.setText("");
            txtMarca.setText("");
            txtUnidaMedida.setText("");
            txtPreVenda.setText("");
            txtQuantidade.setText("");
            txtTPrAquisi.setText("");
            txtDataAqui.setText("");
            int linhasel = jTProdutos.getSelectedRow();
            txtNome.setText(jTProdutos.getValueAt(linhasel, 1).toString());
            txtMarca.setText(jTProdutos.getValueAt(linhasel, 2).toString());
            txtUnidaMedida.setText(jTProdutos.getValueAt(linhasel, 3).toString());
            txtTPrAquisi.setText(jTProdutos.getValueAt(linhasel, 4).toString());
            txtPreVenda.setText(jTProdutos.getValueAt(linhasel, 5).toString());
            txtQuantidade.setText(jTProdutos.getValueAt(linhasel, 6).toString());
            for (int i = 0; i < CadastrarFornecedor.cadastrarFornecedor.size(); i++) {
                int indexfornecedor = Integer.valueOf(jCBFornecedores.getSelectedIndex());
                if (indexfornecedor == vetor[i]) {
                    jCBFornecedores.setSelectedItem(jTProdutos.getValueAt(linhasel, 7).toString());
                }
            }
            txtDataAqui.setText(jTProdutos.getValueAt(linhasel, 8).toString());

        }
    }//GEN-LAST:event_jTProdutosMouseReleased

    private void txtDataAquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataAquiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAquiActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Preco;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JComboBox<String> jCBFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JFormattedTextField txtDataAqui;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreVenda;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTPrAquisi;
    private javax.swing.JTextField txtUnidaMedida;
    // End of variables declaration//GEN-END:variables

}

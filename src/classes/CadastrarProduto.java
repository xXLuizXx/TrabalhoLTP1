/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author PAULO
 */
public class CadastrarProduto {
    private double totalGasto;
    private String dataAqui;
    private int mesCadastro;
    private int anoCadastro;
    private String nome;
    private String marca;
    private int codfornecedor;
    private int quantidade;
    private int codproduto;
    private double precoVenda;
    private double precoAqui;
    private String unidadeMedida;
    public static ArrayList<CadastrarProduto> cadastrarProduto = new ArrayList<>();

    public int getCodfornecedor() {
        return codfornecedor;
    }

    public double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }
    
    public String getDataAqui() {
        return dataAqui;
    }

    public void setDataAqui(String dataAqui) {
        this.dataAqui = dataAqui;
    }

    public int getMesCadastro() {
        return mesCadastro;
    }

    public void setMesCadastro(int mesCdastro) {
        this.mesCadastro = mesCdastro;
    }

    public int getAnoCadastro() {
        return anoCadastro;
    }

    public void setAnoCadastro(int anoCdastro) {
        this.anoCadastro = anoCdastro;
    }

    public void setCodfornecedor(int codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoAqui() {
        return precoAqui;
    }

    public void setPrecoAqui(double precoAqui) {
        this.precoAqui = precoAqui;
    }

    public String getPeso() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void cadastro(int codproduto, String nome, int qtd, String marca, String unidadeMedida, double precoAqui, double precoVenda, int codfornecedor, String data, int mes, int ano, double valorGasto) {
        setCodproduto(codproduto);
        setMarca(marca);
        setQuantidade(qtd);
        setNome(nome);
        setUnidadeMedida(unidadeMedida);
        setPrecoAqui(precoAqui);
        setPrecoVenda(precoVenda);
        setCodfornecedor(codfornecedor);
        setDataAqui(data);
        setMesCadastro(mes);
        setAnoCadastro(ano);
        setTotalGasto(valorGasto);
    }

}

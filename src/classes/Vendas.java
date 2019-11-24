/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class Vendas {
    private String nome;
    private int codProdutoVendido;
    private int quantidade;
    private int mes;
    private int ano;
    private double valorVenda;
    private double valorTotalVenda;
    public static ArrayList<Vendas> vendas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getCodProdutoVendido() {
        return codProdutoVendido;
    }

    public void setCodProdutoVendido(int codProdutoVendido) {
        this.codProdutoVendido = codProdutoVendido;
    }
    
    
    
    public void venda(int cod, String nome, int quantidade, double venda, int mes, int ano, double total){
        setCodProdutoVendido(cod);
        setNome(nome);
        setQuantidade(quantidade);
        setValorVenda(venda);
        setMes(mes);
        setAno(ano);
        setValorTotalVenda(total);
    }
    
}

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
public class CadastrarFornecedor {
    public static ArrayList<CadastrarFornecedor> cadastrarFornecedor = new ArrayList<>();
    
    private int cod = 0;
    private String nome = "";
    private String nomeFantasia = "";
    private String email = "";
    private String cnpj = "";

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void cadastro(int cod, String nome, String nomeFantasia, String email, String cnpj){
        setCod(cod);
        setNome(nome);
        setNomeFantasia(nomeFantasia);
        setEmail(email);
        setCnpj(cnpj);
    }
}

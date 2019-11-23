/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/**
 *
 * @author luiz
 */
public class Pessoa {
    private int id = 0;
    private String nome = "";
    private String cpf = "";
    private String sexo = "";
    private String dataNasc = "";
    private String perm = "";
    
    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void cadastro(int cod, String nome, String cpf, String permi, String sexo, String dataNasc){
        setId(cod);
        setNome(nome);
        setCpf(cpf);
        setPerm(permi);
        setSexo(sexo);
        setDataNasc(dataNasc);
    }
}

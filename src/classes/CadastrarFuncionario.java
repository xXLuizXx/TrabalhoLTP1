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
public class CadastrarFuncionario extends Pessoa{    
    
    public static ArrayList<CadastrarFuncionario> cadastrarUsuario = new ArrayList<>();
    
    private String email = "";
    private String senha = "";
    private String cargo = "";

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    public void cadastro(int cod, String nome, String cpf, String email, String senha, String cargo, String permi, String sexo, String dataNasc){
       super.cadastro(cod, nome, cpf, permi, sexo, dataNasc);
        setEmail(email);
        setSenha(senha);
        setCargo(cargo);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_agrecacao;

/**
 *
 * @author Micro
 */
public class Universidade {
    private String sigla;
    private String nome;
    private Instituto instituto;
    
    public Universidade(){
    }
    
    public String getSigla(){
        return sigla;
    }
      public String getNome(){
        return nome;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
     
    public Instituto getInstituto(){
        return instituto;
    }
    
    public void setInstituto(Instituto instituto){
        this.instituto = instituto;
    }
}

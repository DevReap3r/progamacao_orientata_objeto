/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.atividade_heranca;

/**
 *
 * @author Aluno
 */
public class Produto {
    private int codigo;
    private String descricao;
    private float preco;
    private Fabricante fabricante;
    
    public Produto (String descricao, float preco){
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public String getDescricao(){
        return descricao;
    }
    public float getPreco(){
        return preco;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    
     public Fabricante getFabricante(){
        return fabricante;
    }
     public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }
}

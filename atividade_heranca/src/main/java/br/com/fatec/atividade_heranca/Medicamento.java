/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.atividade_heranca;

/**
 *
 * @author Aluno
 */
public class Medicamento extends Produto{
    private String princAtivo;
    private boolean tarjaPreta;
    
    public Medicamento(String descricao, float preco){
        super(descricao,preco);
    }
    
    public void Aumento(float valor){
        super.setPreco(super.getPreco()*1.1f);
    }
    
    public String ExibeFabricante(){
        return super.getFabricante().getRazSocial();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Aluno
 */
public class Cargo {
    //Atributos
    private String descricao;
    private float gratificacao;

    //construtores (não é obrigatório isso para a classe ´parte')
    public Cargo() {    
    }

    public Cargo(String descricao, float gratificacao) {
        this.descricao = descricao;
        this.gratificacao = gratificacao;
    }
    
    //getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }

}

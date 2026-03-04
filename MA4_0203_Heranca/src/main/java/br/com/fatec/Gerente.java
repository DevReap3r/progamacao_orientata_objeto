/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Aluno
 */
public class Gerente extends Funcionario {
    private float gratificacao;

    //construtor
    public Gerente(String nome) {
        //Obrigatório chamar o construtor da SUPER classe
        super(nome);
    }
    
    //polimorfismo de sobrescrita
    @Override
    public float ganhoMensal() {
        return getSalario() + gratificacao;
        //ou
        // return super.getSalario() + gratificacao;
        //ou
        //return super.ganhoMensal() + gratificacao;
    }
    
    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    
}

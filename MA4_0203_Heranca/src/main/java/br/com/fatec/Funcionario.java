/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private String nome;
    private float salario;

    //construtor parametrico
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    
    /**
     * Informa o total recebido pelo funcionario
     * @return float : salario total
     */
    public float ganhoMensal() {
        return getSalario();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}

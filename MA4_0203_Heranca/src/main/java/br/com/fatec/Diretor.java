/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario {
    //agregação
    private Veiculo veiculo;
    
    //construtor
    public Diretor(String nome) {
        //chamando o construtor da super classe (Funcionario)
        super(nome);
        
        //não vai funcionar, tem que chamar o construtor
        //setNome(nome);
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
}

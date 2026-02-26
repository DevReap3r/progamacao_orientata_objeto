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
    //Atributos encapsulados
    private String nome;
    private int matricula;
    private float salario;
    //agregação
    private Filho filho;
    
    //construtores
    /**
     * Crie o objeto Funcionario, com valores defaults
     */
    public Funcionario() {
        nome = "A Definir";
        matricula = 0;
        salario = 0.0f;
    }
    
    /**
     * Construtor paramétrico 
     * @param nome : Nome do Funcionário
     */
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    /**
     * 
     * @param matricula
     * @param nome
     * @param salario 
     */
    public Funcionario(int matricula, String nome, float salario) {
        //chama outro construtor
        this(nome);
        this.matricula = matricula;
        this.salario = salario;
    }
    
    //Getters e Setters
    public Filho getFilho() {
        return filho;
    }

    public void setFilho(Filho filho) {
        this.filho = filho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String aux) {
        nome = aux;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario)  {

        this.salario = salario;
    }
    
    
    //métodos
    /**
     * Método que calcula o INSS do salário baseado na tabela oficial
     * 
     * @return float - valor calculado do INSS
     */
    public float calculaINSS() {
        float aliquota;
        
        if(salario <= 1212) {
            aliquota = 7.5f;
        }
        else if(salario <= 2427.35) {
            aliquota = 9;
        }
        else if(salario <= 3641.03) {
            aliquota = 12;
        }
        else {
            aliquota = 14;
        }
        
        return salario * (aliquota / 100);
    }
    
    /**
     * Devolve o valor do salário liquido
     * @return float - liquido calculado
     */
    public float salarioLiquido() {
        //devolve o valor do salárioo liquido
        return salario - calculaINSS();
    }
}

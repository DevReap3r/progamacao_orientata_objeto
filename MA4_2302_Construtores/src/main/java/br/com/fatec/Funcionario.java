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
    
    //atributos
    private int matricula;
    private String nome;
    private float salario;
    
    //Construtores
    
    //Construtor DEFAULT
    public Funcionario() {
        System.out.println("Criando Funcionario...");
    }
    
    public Funcionario(String nome) {
        //coloca o parâmetro dentro do atributo
        this.nome = nome;
        //nome = nome  ===> NÃO FUNCIONA

    }
    
    public Funcionario(int matricula, String nome, float salario) {
        //chama o método contrutor (DEVE SER A 1ª LINHA DESTE MÉTODO)
        this(nome); 
        this.matricula = matricula;
        //outra forma de atribuir dados
        setSalario(salario);
    }
    
    
    //getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
    
    
    //metodos
    /**
     * Este método devolve o valor calculado do INSS
     * 
     * @return - valor do INSS
     */
    public float calcularINSS() {
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
     * Calcula o salário liquido do funcionário
     * 
     * @return - salário Liquido
     */
    public float salarioLiquido() {
        //devolve o valor do salárioo liquido
        return salario - calcularINSS();
    }
}

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
    
    //composição
    private Cargo cargo; //tem que usar o construtor
    
    //construtores
    /**
     * Crie o objeto Funcionario, com valores defaults
     * PRECISA RECEBER O CARGO PARA A COMPOSIÇÃO
     */
    public Funcionario(Cargo cargo) {
        nome = "A Definir";
        matricula = 0;
        salario = 0.0f;
        //habilita a composição
        this.cargo = cargo;
    }
    
    /**
     * Construtor paramétrico 
     * @param nome : Nome do Funcionário
     * @param cargo : Cargo do funcionario
     */
    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    
    /**
     * 
     * @param matricula
     * @param nome
     * @param salario 
     * @param cargo
     */
    public Funcionario(int matricula, String nome, float salario,
                       Cargo cargo) {
        //chama outro construtor
        this(nome, cargo);
        this.matricula = matricula;
        this.salario = salario;
    }

    /**
     * Construtor que recebe os dados de cargo e cria o objeto Cargo
     * para formar a composição desta classe
     * @param descricao
     * @param gratificacao 
     */
    public Funcionario(String descricao, float gratificacao) {
        //cria uma instância de cargo para fazer a composição
        cargo = new Cargo(descricao, gratificacao);
    }
    
    /*
    não pode existir, porque assim não existiria mais a 'COMPOSIÇÃO' e sim 'AGREGAÇÃO'
    public Funcionario() {
        
    }
    */
        
    //Getters e Setters
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
        
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
    
    /**
     * Devolve o nome do Filho
     * @return - Nome do Filho
     */
    public String nomeFilho() {
        return filho.getNome();
    }
    
    /**
     * Aplica um aumento no salário do funcionario
     * baseado na gratificação que ele possui no cargo
     * @return - Novo salário já com o aumento
     */
    public float aplicarAumento() {
        this.salario *= (cargo.getGratificacao() / 100) + 1;
        return salario;
    }
}

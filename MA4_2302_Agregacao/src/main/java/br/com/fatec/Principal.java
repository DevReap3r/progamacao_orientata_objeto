/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.fatec;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        //aqui vai o programa
        
        //criar um objeto funcionario
        Funcionario f1 = new Funcionario();
                
        //colocando dados no objeto
        f1.setMatricula(1234);
        f1.setNome("Helio Silva");
        f1.setSalario(5400.99f);
        
        //criar um objeto filho
        Filho filho = new Filho("Maria");
        //colocar dados do filho
        filho.setIdade(23);
        
        //inserir objeto criar dentro de Funcionario
        f1.setFilho(filho);
        
        //exibindo as informações
        System.out.println("Matricula: " + f1.getMatricula());
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salário: " + f1.getSalario());
        
        System.out.println("Liquido: " + f1.salarioLiquido());
        System.out.println("INSS: " + f1.calculaINSS());
        
        //mostrar os dados do filho
        System.out.println("Nome Filho(a): " + f1.getFilho().getNome());
        System.out.println("Idade: " + f1.getFilho().getIdade());
        
        //trocando o nome do filho
        f1.getFilho().setNome("Claudinho");
        
        //mostrar os dados de Filho atraves do objeto filho mesmo
        System.out.println("Filho...: " + filho.getNome());
        System.out.println("Idade...: " + filho.getIdade());
        
        //criando uum objeto Filho ANONIMO para funcionario
       //cria o funcionario
        Funcionario f2 = new Funcionario();
        //cria o objeto filho de forma anonima
        f2.setFilho(new Filho("Pedro"));
        
        
    }
}

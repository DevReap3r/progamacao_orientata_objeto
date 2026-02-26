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
        
        //criando os objetos (instancias)
        Funcionario f1 = new Funcionario();
        //atribui dados para f1
        f1.setMatricula(1);
        f1.setNome("Maria");
        f1.setSalario(5600.99f);
        
        
        //ou
        Funcionario f2 = null;
        //alguma coisa ...
        f2 = new Funcionario();
        //atribui dados para f2
        f2.setMatricula(33);
        f2.setNome("João");
        f2.setSalario(1300);
        
        //Exibir os dados
        System.out.println("F1 --------------------------");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salário: " + f1.getSalario());

        System.out.println("F2 --------------------------");
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Salário: " + f2.getSalario());     
        
        
        System.out.println("F2 Pós INSS-----------------");
        //chama um método
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Salário: " + f2.getSalario());  
        System.out.println("INSS: " + f2.calcularINSS());  
        //ou
        System.out.println("Salário Liquido: " + f2.salarioLiquido());  
        
        
    }
}

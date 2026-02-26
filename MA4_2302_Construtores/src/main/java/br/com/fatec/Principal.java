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
        Funcionario f1 = new Funcionario(); //construtor DEFAULT
        Funcionario f2 = null;
        f2 = new Funcionario();
        
        //atribuir nome para F1
        f1.setNome("Helio Pedro");
        
        //criando F3 já com nome
        Funcionario F3 = new Funcionario("Perola Pereira"); //economizei um SetNome()
        
        //criando F4 com todos os dados
        Funcionario f4 = new Funcionario(123, "Ernesto Carlos", 5600.00f);
    }
}

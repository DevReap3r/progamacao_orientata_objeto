/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.fatec;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
               
        //criando os objetos (instancias)
        Funcionario f1 = new Funcionario(); //Construtor DEFAULT
        Funcionario f2 = null;
        f2 = new Funcionario();
        
        //atribuir nome para F1
        f1.setNome("Hello Pedro");
        
        //criando F3 já com nome
        Funcionario f3 = new Funcionario("Perola Pereira"); //Economizei um setNome()
                
        //criando F4 com todos os dados
        Funcionario f4 = new Funcionario(123, "Ernesto Carlos", 5600.00f);
    }
}

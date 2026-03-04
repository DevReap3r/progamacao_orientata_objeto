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
        //criando um Funcionario
        Funcionario f1 = new Funcionario("Marta Maria");
        //f1.setNome("Marta Maria");  NÃO PRECISA
        f1.setSalario(5000);
        
        //criando um Gerente
        Gerente g1 = new Gerente("Pedro");
        //g1.setNome("Pedro"); NÃO PRECISA
        g1.setSalario(6700);
        g1.setGratificacao(500); //só tem em Gerente
                                 //não tem veiculo
        
        //criando um Diretor
        Veiculo v1 = new Veiculo();
        v1.setPlaca("ABC-1234");
        Diretor d1 = new Diretor("Ana Paula");
        //d1.setNome("Ana Paula"); NÃO PRECISA
        d1.setSalario(8900);
        d1.setVeiculo(v1);  //não tem gratificação
        
    }
}

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
        
        //não funciona porque todo funcionario DEVE possuir um cargo
        //Funcionario qualquer = new Funcionario();
        
        //criando um cargo inicialmente separado
        Cargo c1 = new Cargo();
        c1.setDescricao("Supervisor de Expedição");
        c1.setGratificacao(10); //este cargo em 10% de gratificacao
        
        //criar um objeto funcionario
        //tenho que passar o cargo como parâmetro para o Funcionario
        Funcionario f1 = new Funcionario(c1);
                
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
        
        //mostrar os dados da composição
        System.out.println("Cargo:");
        System.out.println("Descrição: " + f1.getCargo().getDescricao());
        System.out.println("Gratificação: " + f1.getCargo().getGratificacao());
        
        //chamando métodos
        //aplicando um aumento no salário
        System.out.println("Novo Salário: " + f1.aplicarAumento());
        
        
        
        
        
    }
}

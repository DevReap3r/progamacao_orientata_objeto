/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_agrecacao;

/**
 *
 * @author Micro
 */
public class Exercicio_Agrecacao {
    
    public static void main(String[] args) {
 
    Instituto instituto = new Instituto();
    instituto.setNomeInstituto("Instituto de Matemática e Estatistica");
    instituto.setSiglaInstituto("IME");
    
    Universidade universidade = new Universidade();
    universidade.setNome("Universidade de São Paulo");
    universidade.setSigla("USP");
    universidade.setInstituto(instituto);
    
        System.out.println("Universidade: "+universidade.getNome() + "("+universidade.getSigla()+")");
        System.out.println("Instituto: "+universidade.getInstituto().getNomeInstituto()+"("+instituto.getSiglaInstituto()+")");
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_agrecacao;

/**
 *
 * @author Micro
 */
public class Instituto {
    private String siglaInstituto;
    private String nomeInstituto;
    
    public Instituto(){
    }
    
    public Instituto(String siglaInstituto,String nomeInstituto){
        this.nomeInstituto = nomeInstituto;
        this.siglaInstituto = siglaInstituto;
    }
    
    public String getSiglaInstituto(){
        return siglaInstituto;
    }
    
    public String getNomeInstituto(){
        return nomeInstituto;
    }
    
    public void setSiglaInstituto(String siglaInstituto){
        this.siglaInstituto = siglaInstituto;
    }
    
    public void setNomeInstituto(String nomeInstituto){
        this.nomeInstituto = nomeInstituto;
    }
}

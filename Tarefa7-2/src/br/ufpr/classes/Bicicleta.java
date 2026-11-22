/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.ufpr.classes;

/**
 *
 * @author renan
 */
class Bicicleta { 
    private int cadencia = 0; 
    private int velocidade = 0; 
    private int marcha = 1; 
    
    public Bicicleta(int velocidade, int cadencia, int marcha){
        this.cadencia = cadencia;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }  
  
    void mudarCadencia(int novoValor){ 
     cadencia = novoValor; 
    } 
 
    void mudarMarcha(int novoValor){ 
     marcha = novoValor; 
    } 
 
    void aumentarVelocidade(int incremento){ 
        
    
     velocidade = velocidade + incremento; 
    } 
 
    void aplicarFreios(int decremento){ 
     velocidade = velocidade - decremento; 
    } 

    void printStates(){ 
        System.out.println("cadencia="+cadencia+" velocidade="+velocidade+
        "marcha="+marcha); 
    } 
    
    public void setVelocidade(int velocidade) throws VelocidadeInvalidaException {
        
        if(velocidade < 0 || velocidade > 100){
            throw new VelocidadeInvalidaException("Velocidade invalida! Digite entre 0 a 100km");
        }
        
        this.velocidade = velocidade;        
    }
    
    public void setRPM(int rpm) throws RPMInvalidoException {

        if (rpm < 0) {
            throw new RPMInvalidoException("RPM inválido! Não pode ser negativo.");
        }

        this.cadencia = rpm;
    }
    
    public void setMarcha(int marcha) throws MarchaInvalidaException {

        if (marcha < 0 || marcha > 24) {
            throw new MarchaInvalidaException("Marcha inválida! Digite entre 0 e 24.");
        }

        this.marcha = marcha;
    }
} 

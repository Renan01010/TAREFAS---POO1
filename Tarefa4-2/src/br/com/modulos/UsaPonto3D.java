/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulos;

/**
 *
 * @author renan
 */
public class UsaPonto3D {
    public void main (String [] args){
        Ponto3D ponto1 = new Ponto3D(10, 10, 20, "Vermelho", 0.8);
        Ponto3D ponto2 = new Ponto3D(2, 16, 25, "Preto", 0.8);
        
        double distancia = ponto1.calculaDistancia(ponto2);
        
        System.out.printf("Distancia do ponto 1 ao Ponot 2: %.2f%n", distancia);
      
    }
    
}

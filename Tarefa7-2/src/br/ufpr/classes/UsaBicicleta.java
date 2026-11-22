/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.classes;

/**
 *
 * @author renan
 */
public class UsaBicicleta {

    public static void main(String[] args) {

        Bicicleta bike = new Bicicleta(50, 80, 5);
        
        try {
            bike.setVelocidade(120);
        } catch (VelocidadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        try {
            bike.setRPM(-10);

        } catch (RPMInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        try {
            bike.setMarcha(25);

        } catch (MarchaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.retangulo;

/**
 *
 * @author renan
 */
public class UsaRetangulo {

    public static void main(String[] args) {

        try {

            Retangulo meuRetangulo = new Retangulo(40, 50);

            System.out.println("A área do meu retângulo é = "
                    + meuRetangulo.area());

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());

        }
        
        try {

            Retangulo meuRetangulo = new Retangulo(-40, 50);

            System.out.println("A área do meu retângulo é = "
                    + meuRetangulo.area());

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());

        }
        
        

    }
}

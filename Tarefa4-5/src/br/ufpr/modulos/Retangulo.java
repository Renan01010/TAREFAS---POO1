package br.ufpr.modulos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Retangulo {
    public int altura;
    public int largura;
    
    public Retangulo(){
        
    }

    public double area() {
        return this.largura * this.altura;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getLargura() {
        return this.largura;
    }
}

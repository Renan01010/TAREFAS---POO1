/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.ufpr.retangulo;

/**
 *
 * @author renan
 */
public class Retangulo {

    public int altura;
    public int largura;

    public Retangulo(int altura, int largura) {

        if (altura < 0 || largura < 0) {
            throw new IllegalArgumentException(
                "Os lados do retângulo não podem ser negativos!"
            );
        }

        this.altura = altura;
        this.largura = largura;
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

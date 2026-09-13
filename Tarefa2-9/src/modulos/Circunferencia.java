package modulos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Circunferencia {
    private int raio;
    private double PI = 3.141594;

    public Circunferencia() {
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return this.PI * (Math.pow(this.raio, 2));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public boolean ehEscaleno() {
        if(this.ehIsosceles() != true && this.ehEquilatero() != true){
            return true;
        }
        return false;
    }

    public boolean ehEquilatero() {
        if(this.lado1 == this.lado2 && this.lado1 == this.lado3){
            return true;
        }
        return false;
    }

    public boolean ehIsosceles() {
        if(this.lado1 == this.lado2 || this.lado2 == this.lado3 
                || this.lado3 == this.lado1){
            return true;
        }
        return false;      
    }
   
}

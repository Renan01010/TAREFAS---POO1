/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Quadrado {
    private int lado;
    
    public Quadrado(){
        
    }
    
    public Quadrado(int lado){
        this.lado = lado;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularPerimetro() {
        return this.lado * 4;
    }

    public int calcularArea() {
        return this.lado * this.lado;
    }
    
    
}

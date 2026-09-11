package modulos;

import java.util.InputMismatchException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Ponto2D {
    private int x = 0;
    private int y = 0;
    
    public Ponto2D(){
        
    }
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }

    public void setX(int x) {
        this.x = x;          
    }

    public void setY(int y) {
        this.y = y;       
    }

    public double calcularDistancia(Ponto2D ponto) {
        double diferencaX = ponto.x - this.x;
        double diferencaY = ponto.y - this.y;
        
        return Math.hypot(diferencaX, diferencaY);
    }
    
}

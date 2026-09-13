
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class UsaQuadrado {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        int lado = 0;
        
        while(true){
            try{
                System.out.println("Digite o lado do Quadrado: ");
                lado = scn.nextInt();
                quadrado.setLado(lado);
                break;
            } catch (InputMismatchException e){
                System.out.println("Entre com um numero!");
                scn.next();
            }
        }
        
        System.out.println("Perimetro: " + quadrado.calcularPerimetro());
        System.out.println("Area: " + quadrado.calcularArea());
        scn.close();
    }
    
}

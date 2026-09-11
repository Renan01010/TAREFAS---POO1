/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author renan
 */
public class Principal {
    public static void main(String [] args){
        int pontoX = 0;
        int pontoY = 0;
        
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("Digite as coordenadas de um ponto A!");
            try{
               if(pontoX == 0){
                   System.out.println("Coordenada X: ");
                   pontoX = scn.nextInt();
               }
               if(pontoY == 0){
                   System.out.println("Coordenada Y: ");
                   pontoY = scn.nextInt();
               }
               
            } catch (InputMismatchException e){
                System.out.println("Caracter digitado nao e um numero!");
                scn.next();
                continue;
            }
            break;
        }
            Ponto2D ponto1 = new Ponto2D(pontoX, pontoY);


            Ponto2D ponto2 = new Ponto2D();
        while(true){
            System.out.println("Digite as coordenadas de um ponto B!");
            try{
                if(ponto2.getX() == 0){
                    System.out.println("Coordenada X: ");
                    ponto2.setX(scn.nextInt());
                }
                
                if(ponto2.getY() == 0){
                   System.out.println("Coordenada Y: ");
                   ponto2.setY(scn.nextInt()); 
                }
                  
            } catch (InputMismatchException e){
                System.out.println("Caracter digitado nao e um numero!");
                scn.next();
                continue;
            }

            System.out.printf("Distancia entre o ponto A e B e: %.2f", ponto1.calcularDistancia(ponto2));
            scn.close();
            break;
        }
        
    }
    
}

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
public class UsaCircunferencia {
    public static void main (String args[]){
        int raio = 0;
        Scanner scn = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Digite o valor da raio da cincunferencia: ");
                raio = scn.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Entre com um numero valido!");
                scn.next();
            }
        }
 
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.setRaio(raio);
        System.out.println("A area e: " + circunferencia.calcularArea());
        scn.close();
    }
    
}

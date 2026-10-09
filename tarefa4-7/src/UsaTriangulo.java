
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
public class UsaTriangulo {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        Triangulo isoceles = new Triangulo();
        
        try{
            System.out.println("Digite as medidas de um triangulo,");
            System.out.println("Lado 1: ");
            isoceles.setLado1(scn.nextInt());
            System.out.println("Lado 2: ");
            isoceles.setLado2(scn.nextInt());
            System.out.println("Lado 3: ");
            isoceles.setLado3(scn.nextInt());           
            System.out.println("Seu triangulo e: " + isoceles.verificaTriangulo());
        } catch (InputMismatchException e){
            System.out.println("Entre com um numero valido!");
            scn.next();
        }
        
        isoceles = null;
        System.gc();
        
        
    }
    
}

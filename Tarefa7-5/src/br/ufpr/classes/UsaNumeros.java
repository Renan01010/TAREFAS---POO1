/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.classes;

import java.util.Scanner;

/**
 *
 * @author renan
 */
public class UsaNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;

        System.out.println("Informe os números na sequencia solicitada.");
        System.out.println("Para sair digite 'S'");
        
        while (true) {
            System.out.print("Numero " + (quantidade + 1) + "=");

            String valor = entrada.nextLine();
            
            if (valor.equalsIgnoreCase("S")) {
                break;
            }
            try {         
                double numero = Double.parseDouble(valor);
                
                soma = soma + numero;
                
                quantidade++;
            } catch (NumberFormatException e) {
                System.out.println("Erro de entrada.");
                System.out.println(valor +
                    " não é um numérico válido. Tente novamente ou digite S para sair.");
            }
        }
      
        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("A soma dos números digitados é=" + soma);
            System.out.println("A média dos números digitados é=" + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
        entrada.close();
    }
}

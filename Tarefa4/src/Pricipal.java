
import br.ufpr.modulos.Pessoa;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Pricipal {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
         
        System.out.println("Digite seu nome: ");
        String nome = scn.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = scn.nextInt();
        scn.nextLine();
        
        System.out.println("Digite seu endereco: ");
        String endereco = scn.nextLine();
        
        Pessoa pessoa = new Pessoa(nome, idade, endereco);
        
        System.out.println("Os dados Sao: "
                + "\nNome: " + pessoa.getNome()
                + "\nIdade: "+ pessoa.getIdade()
                + "\nEndereco: " + endereco);
        
        pessoa.imprime();
        pessoa.fezAniversario();
        pessoa.fezAniversario();
        pessoa.fezAniversario();
        pessoa.fezAniversario();
        pessoa.imprime();
             
        
    }
    
}

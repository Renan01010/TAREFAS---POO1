
import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class SistemaAcademico {
    static Aluno[] alunos;
    static int quantidadeAlunos = 0;
    
    public static void main(String [] Args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Iniciando sistema...");
        System.out.println("Quantos Alunos deseja Cadastrar?");
        alunos = new Aluno[quantidadeAlunos = scn.nextInt()]; 
        scn.nextLine();
        
        while(true){
           System.out.println("==== MENU ====");
           System.out.println("1 - Cadastrar Aluno");
           System.out.println("2 - Excluir Aluno por Nome");
           System.out.println("3 - Listar Alunos");
           System.out.println("4 - Matricular Aluno em Disciplina");
           System.out.println("5 - Cancelar Matricula");
           System.out.println("6 - Imprimir lista Alunos e Disciplinas Matriculadas");
           int opcao = scn.nextInt();
           
           switch (opcao) {
               case 1:
                   System.out.println("Nome: ");
                   String nome = scn.nextLine();
                   
                   System.out.println("Matricula: ");
                   String matricula = scn.nextLine();
                   
                   System.out.println("Curso: ");
                   String curso = scn.nextLine();
                   
                   System.out.println("Periodo: ");
                   int periodo = scn.nextInt();
                   
                   System.out.println("Idade: ");
                   int idade = scn.nextInt();
                   
                   scn.nextLine();
                   Aluno aluno = new Aluno(nome, matricula, curso, periodo, idade, 0);
                   cadastrarAluno(aluno);
                   break;
               case 2:
                   System.out.println("nome: ");
                   nome = scn.next();
                   excluirAlunoPorNome(nome);
                   break;
               case 3:
                   Aluno[] lista = listarAlunos();
                   
                   if(lista.length == 0){
                     System.out.println("Nenhum aluno cadastrado.");  
                   }
                   
                   for (Aluno a: lista){
                       System.out.println(a.imprime());
                   }
                   
                   break;
               case 4: 
                   System.out.printl("Qual o nome do Aluno: ");
                   nome = scm.nextLine();
                   
                   aluno = buscar
        }
        
        
    }
    
    
    
    
    
    
    
    public static void cadastrarAluno(Aluno aluno) {
        
    }

    public static void excluirAlunoPorNome(String nomeAluno) {
        
    }

    public static Aluno[] listarAlunos() {
      return Aluno[1];
    }

    public static void matricularAlunoEmDisciplina(Aluno aluno2, String lpoo) {
        
    }

    public static void cancelarMatricula(Aluno aluno2, String lpoo) {
        
    }

    public static void imprimirListaDeAlunoseDisciplinas() {
        
    }
    
}

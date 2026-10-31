
import static SistemaAcademico.alunos;
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
           System.out.println("0 - Finalizar Programa");
           int opcao = scn.nextInt();
           
           switch (opcao) {
               case 0:
                   System.out.println("Ecerrando...");
                   break;
               case 1:
                   System.out.println("Nome: ");
                   String nome = scn.next();
                   scn.nextLine();
                   
                   System.out.println("Matricula: ");
                   String matricula = scn.next();
                   scn.nextLine();
                   
                   System.out.println("Curso: ");
                   String curso = scn.next();
                   scn.nextLine();
                   
                   System.out.println("Periodo: ");
                   int periodo = scn.nextInt();
                   scn.nextLine();
                   
                   System.out.println("Idade: ");
                   int idade = scn.nextInt();
                   
                   scn.nextLine();
                   Aluno aluno = new Aluno(nome, matricula, curso, periodo, idade, 10);
                   cadastrarAluno(aluno);
                   break;
               case 2:
                   System.out.println("nome: ");
                   nome = scn.next();
                   excluirAlunoPorNome(nome);
                   break;
               case 3:
                   Aluno[] alunosLista = listarAlunos();
                   
                   for(Aluno a: alunosLista){
                       if(a != null){
                            System.out.println(a.getNome());
                       }
                   }
                   
                   break;
               case 4: 
                   System.out.println("Qual o nome do Aluno: ");
                   nome = scn.next();
                   scn.nextLine();
                   
                   for (int i = 0; i < quantidadeAlunos; i++){
                       if(alunos[i].getNome().equalsIgnoreCase(nome)){
                           System.out.println("Nome da disciplina: ");
                           String disciplina = scn.nextLine();
                           matricularAlunoEmDisciplina(alunos[i], disciplina);
                           break;
                       }
                       
                       System.out.println("Nome nao encontrado!");
                       break;
                   }
                   break;
               case 5:
                   System.out.println("Qual o nome do Aluno: ");
                   nome = scn.next();
                   scn.nextLine();
                   
                   for (int i = 0; i < quantidadeAlunos; i++){
                       if(alunos[i].getNome().equalsIgnoreCase(nome)){
                           System.out.println("Nome da disciplina: ");
                           String disciplina = scn.next();
                           scn.nextLine();
                           cancelarMatricula(alunos[i], disciplina);
                           break;
                       }
                       
                       System.out.println("Nome nao encontrado!");
                       break;
                   }
                   break;
               case 6:
                   String resultado = imprimirListaDeAlunoseDisciplinas();
                   System.out.println(resultado);
                   break;
               default:
                   System.out.println("Entre com um numero valido");       
        
           }
           if(opcao == 0){
               break;
           }
        }
    }
    
    
    
    
    
    
    
    public static void cadastrarAluno(Aluno aluno) {
        for( int i = 0; i <alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
                
                return;
            }
        }
        
        System.out.println("Limite de alunos atingido.");
        
    }

    public static void excluirAlunoPorNome(String nomeAluno) {
        for (int i = 0; i < alunos.length; i++){
            if(alunos[i]!= null && alunos[i].getNome().equalsIgnoreCase(nomeAluno)){
                
                for(int j = i; j < alunos.length - 1; j++){
                    alunos[j] = alunos[j + 1];
                }
                
                alunos[alunos.length -1] = null;
                
                return;
            }
        }
    }

    public static Aluno[] listarAlunos() {
        Aluno[] limpo = new Aluno[quantidadeAlunos];
        int posicao = 0;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i]!= null){
                limpo[posicao++] = alunos[i];
            }
        }
      return limpo;
    }

    public static void matricularAlunoEmDisciplina(Aluno aluno, String disciplina) {
        aluno.fazMatricula(disciplina);
        return;
    }

    public static void cancelarMatricula(Aluno aluno, String disciplina) {
        aluno.cancelarMatricula(disciplina);
        return;
    }

    public static String imprimirListaDeAlunoseDisciplinas() {
        String resultado = "";
        
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                resultado += alunos[i].imprime() + "\n";
            }
        }
        return resultado;                
    }
    
}

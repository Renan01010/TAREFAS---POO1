
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private int periodo;
    private int idade;
    private int quantidadeDisciplinasPermitidas = 0;
    private ArrayList<String> disciplinasMatriculadas;

    public Aluno(String nome, String matricula, String curso, int periodo, int idade, int quantidadeDisciplinasPermitidas) {
       this.nome = nome;
       this.matricula = matricula;
       this.curso = curso;
       this.periodo = periodo;
       this.idade = idade;
       this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
       this.disciplinasMatriculadas = new ArrayList<>();
    }
    
    public String fazMatricula(String disciplina) {
        if(this.disciplinasMatriculadas.size() >= this.quantidadeDisciplinasPermitidas){
            return "Quantidade de disciplinas excedida. O limite de \n" +
                                "disciplinas para este aluno é de" +  this.quantidadeDisciplinasPermitidas + " disciplina(s). Se desejar, cancele a \n" +
                                "matrícula de uma das disciplinas e faça a nova matrícula.";
        }else if(this.quantidadeDisciplinasPermitidas == 0){
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        } else {
            this.disciplinasMatriculadas.add(disciplina);
            return "Matrícula na disciplina " + disciplina + " executada.";           
        }
               
    } 

    public String cancelarMatricula(String disciplina) {
        if(this.disciplinasMatriculadas.contains(disciplina)){
            this.disciplinasMatriculadas.remove(disciplina);
            return "Cancelamento da matrícula da disciplina LPOO" + disciplina + "executado com sucesso.";
        }else {
            return "Aluno não está matriculado na disciplina " + disciplina;
        }
    }

    public String imprime() {
        String disciplinasFormatadas = String.join("; ", this.getDisciplinasMatriculadas());
        return "---------------------------------------------------------\n" +
        "Nome do Aluno: " + this.nome +
        "\nMatricula: " + this.matricula +
        "\nCurso: " + this.curso +
        "\nPeriodo: " + this.periodo +
        "\nDisciplinas Matriculadas: " + disciplinasFormatadas + 
        "\n---------------------------------------------------------";
                
    }

    public ArrayList<String> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }
    
    
    
    
}

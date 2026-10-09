/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renan
 */
public class TesteAluno {
    @Test
    public void TesteAluno() {
        Aluno aluno1 = new Aluno("Rafael Romualdo Wandresen", "GRR20130101", "TADS", 4, 20, 5);
        String matricula = aluno1.fazMatricula("Gestão de Projetos");
        String matricula2 = aluno1.fazMatricula("LPOO");
        String cancelarMatricula = aluno1.cancelarMatricula("TADS");
        String imprime = aluno1.imprime();
        
        System.out.println(matricula);
        assertEquals("Matrícula na disciplina Gestão de Projetos executada.", matricula);
        
        String esperada = "---------------------------------------------------------\n" +
                          "Nome do Aluno: Rafael Romualdo Wandresen\n" +
                          "Matricula: GRR20130101\n" +
                          "Curso: TADS\n" +
                          "Periodo: 4\n" +
                          "Disciplinas Matriculadas: Gestão de Projetos; LPOO\n" +
                          "---------------------------------------------------------";
        System.out.println(aluno1.imprime());
        System.out.println(esperada);
        
        
        
        
        assertEquals(esperada, aluno1.imprime());
        
    }
    
}

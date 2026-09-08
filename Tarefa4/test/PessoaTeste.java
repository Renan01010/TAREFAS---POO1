/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.ufpr.modulos.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renan
 */
public class PessoaTeste {
    @Test
    public void PessoaTeste1(){
       Pessoa lucas = new Pessoa("Lucas Labendzs", 20, "Santa Candida");
      
       String nome = lucas.getNome();
       int idade = lucas.getIdade();
       String endereco = lucas.getEndereco();
       
       assertEquals("Lucas Labendzs", nome);
       assertEquals(20, idade, 0.0);
       assertEquals("Santa Candida", endereco);
    }
    
    
    @Test
    public void PessoaTeste2(){
        Pessoa lucas = new Pessoa();
        
        lucas.setNome("Lucas");
        lucas.setIdade(20);
        lucas.setEndereco("Centro Civico");
       
       String nome = lucas.getNome();
       int idade = lucas.getIdade();
       String endereco = lucas.getEndereco();
       
       assertEquals("Lucas", nome);
       assertEquals(20, idade, 0.0);
       assertEquals("Centro Civico", endereco);
    }
    
    @Test
    public void PessoaTeste3(){
        Pessoa pessoa = new Pessoa("Lucas", 20, "Centro");
        
        pessoa.fezAniversario();
        assertEquals(21, pessoa.getIdade(), 0.0);
        
        pessoa.imprime();
    }
}



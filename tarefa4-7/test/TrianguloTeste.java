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
public class TrianguloTeste {
    @Test
    public void TrianguloTeste1() {
        Triangulo escaleno = new Triangulo();
        escaleno.setLado1(7);
        escaleno.setLado2(9);
        escaleno.setLado3(12);
        
        boolean resultado = escaleno.ehEscaleno();
        assertTrue(resultado);
        resultado = escaleno.ehEquilatero();
        assertFalse(resultado);
        resultado = escaleno.ehIsosceles();
        assertFalse(resultado);
        
        
    }
    @Test
    public void TrianguloTeste2() {
        Triangulo equilatero = new Triangulo();
        equilatero.setLado1(10);
        equilatero.setLado2(10);
        equilatero.setLado3(10);
        
        boolean resultado = equilatero.ehEscaleno();
        assertFalse(resultado);
        resultado = equilatero.ehEquilatero();
        assertTrue(resultado);
        resultado = equilatero.ehIsosceles();
        assertTrue(resultado);
        
        
    }
    @Test
    public void TrianguloTeste3() {
        Triangulo isoceles = new Triangulo();
        isoceles.setLado1(7);
        isoceles.setLado2(12);
        isoceles.setLado3(12);
        
        boolean resultado = isoceles.ehEscaleno();
        assertFalse(resultado);
        resultado = isoceles.ehEquilatero();
        assertFalse(resultado);
        resultado = isoceles.ehIsosceles();
        assertTrue(resultado);
                
    }
    
}

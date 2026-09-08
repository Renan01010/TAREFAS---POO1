/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.com.modulos.Ponto3D;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renan
 */
public class PontoTeste {
    @Test 
    public void PontoTeste1() {
        Ponto3D ponto = new Ponto3D(10, 30, 40, "Amarelo", 0.9);
        Ponto3D ponto2 = new Ponto3D(12, 23, 60, "Verde", 0.8);
        
        double resultado = ponto.calculaDistancia(ponto2);
        assertEquals(21.28, resultado, 0.1);
    }
        
          
}

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
public class QuadradoTeste {
    @Test
    public void QuadradoTeste1() {
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(10);
        int perimetro = quadrado1.calcularPerimetro();
        int area = quadrado1.calcularArea();
        
        assertEquals(40, perimetro, 0.0);
        assertEquals(100, area, 0.0);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import modulos.Circunferencia;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renan
 */
public class CrcunferenciaTeste {
    @Test
    public void CrcunferenciaTeste1() {
        Circunferencia circulo = new Circunferencia();
        circulo.setRaio(30);
        double area = circulo.calcularArea();
        assertEquals(2827.43, area, 0.01);
    }
    
}

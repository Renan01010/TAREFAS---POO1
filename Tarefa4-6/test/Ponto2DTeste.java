/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import modulos.Ponto2D;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renan
 */
public class Ponto2DTeste {
    @Test
    public void Ponto2DTeste1() {
        Ponto2D coordenadas1 = new Ponto2D();
        coordenadas1.setX(10);
        coordenadas1.setY(20);
        
        Ponto2D coordenadas2 = new Ponto2D(30, 10);
        
        double distancia = coordenadas1.calcularDistancia(coordenadas2);
        assertEquals(22.36, distancia, 0.1);
    }
    
    @Test
    public void Ponto2DTeste2() {
        Ponto2D coordenadas1 = new Ponto2D();
        coordenadas1.setX(10);
        coordenadas1.setY(20);
        
        Ponto2D coordenadas2 = new Ponto2D(30, 10);
        
        double distancia = coordenadas1.calcularDistancia(coordenadas2);
        assertEquals(22.36, distancia, 0.1);
    }
    
}

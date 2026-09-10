/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.ufpr.modulos.Retangulo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renan
 */
public class RetanguloTeste {
    @Test
    public void Teste1() {
        Retangulo meuRetangulo = new Retangulo();
        meuRetangulo.altura = 40;
        meuRetangulo.largura = 50;
        double area = meuRetangulo.area();
        System.out.println("A Area do retangulo e = " + meuRetangulo.area());
        
        int altura = meuRetangulo.getAltura();
        int largura = meuRetangulo.getLargura();
        assertEquals(40, altura, 0.0);
        assertEquals(50, largura, 0.0);
        assertEquals(2000, area, 0.0);    
           
    }
    
}

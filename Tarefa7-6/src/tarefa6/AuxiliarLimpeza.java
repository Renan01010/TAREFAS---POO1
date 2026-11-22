/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa6;

/**
 *
 * @author renan
 */


public class AuxiliarLimpeza extends Funcionario {

    public AuxiliarLimpeza(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.5;
    }
}

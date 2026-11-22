/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa6;

/**
 *
 * @author renan
 */



public class Gerente extends Funcionario {

    private Funcionario[] funcionariosGerenciados;

    public Gerente(String nome, double salario,
                   Funcionario[] funcionariosGerenciados) {

        super(nome, salario);

        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    @Override
    public double getBonus() {
        return (2 * getSalario()) +
                (100 * funcionariosGerenciados.length);
    }
}

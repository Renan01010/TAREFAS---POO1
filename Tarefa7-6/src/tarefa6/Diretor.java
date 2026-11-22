/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa6;

/**
 *
 * @author renan
 */
public class Diretor extends Funcionario {

    private Departamento[] departamentos;

    public Diretor(String nome, double salario,
               Departamento[] departamentos)
               throws RegraNegocioException {

    super(nome, salario);

    if (departamentos == null || departamentos.length < 2) {

        throw new RegraNegocioException(
            "Um diretor precisa administrar no mínimo 2 departamentos!"
        );
    }

        this.departamentos = departamentos;
    }

    @Override
    public double getBonus() {
        return (4 * getSalario()) +
                (3000 * departamentos.length);
    }
}


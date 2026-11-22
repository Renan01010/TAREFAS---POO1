/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa6;

/**
 *
 * @author renan
 */

public class SistemaRH {

    public static void imprimeRelatorio(Funcionario[] listaFuncionarios) {

        System.out.println("========== RELATORIO RH ==========");

        for (Funcionario funcionario : listaFuncionarios) {

            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salario: R$ " + funcionario.getSalario());
            System.out.println("Bonus: R$ " + funcionario.getBonus());

            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {

        // Criando funcionários
        Analista analista = new Analista("Joao", 4000);
        Programador programador = new Programador("Pedro", 5000);
        AuxiliarLimpeza auxiliar = new AuxiliarLimpeza("Maria", 2000);

       
        Funcionario[] equipe = {analista, programador};

        Gerente gerente = new Gerente("Carlos", 6000, equipe);

        
        Departamento[] departamentos = {
            new Departamento("TI"),
            new Departamento("Financeiro")
        };

        Diretor diretor = new Diretor("Roberto", 10000, departamentos);

       
        Funcionario[] funcionarios = {
            analista,
            programador,
            auxiliar,
            gerente,
            diretor
        };

     
        imprimeRelatorio(funcionarios);
    }
}


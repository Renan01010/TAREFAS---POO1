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

      
        Analista analista = new Analista("Joao", 4000);
        Programador programador = new Programador("Pedro", 5000);
        AuxiliarLimpeza auxiliar = new AuxiliarLimpeza("Maria", 2000);
        Analista analista2 = new Analista("Lucas", 3500);
        Programador programador2 = new Programador("Carlos", 4500);

       
        Funcionario[] equipe = {
            analista,
            programador,
            auxiliar,
            analista2,
            programador2
        };

        
        Gerente gerente = null;

        try {

            gerente = new Gerente("Roberto", 6000, equipe);

            System.out.println("Gerente criado com sucesso!");

        } catch (RegraNegocioException e) {

            System.out.println("Erro ao criar gerente: " + e.getMessage());
        }

        
        Funcionario[] equipePequena = {analista, programador};

        try {

            Gerente gerenteInvalido =
                    new Gerente("Carlos", 5000, equipePequena);

        } catch (RegraNegocioException e) {

            System.out.println("Erro: " + e.getMessage());
        }

        
        try {

            gerente.setFuncionariosGerenciados(equipePequena);

        } catch (RegraNegocioException e) {

            System.out.println("Erro ao alterar equipe: " + e.getMessage());
        }

        
        Departamento[] departamentos = {
            new Departamento("TI"),
            new Departamento("Financeiro")
        };

        Diretor diretor = null;

       
        try {

            diretor = new Diretor("Roberto", 10000, departamentos);

            System.out.println("Diretor criado com sucesso!");

        } catch (RegraNegocioException e) {

            System.out.println("Erro ao criar diretor: " + e.getMessage());
        }

        
        try {

            Departamento[] departamentoPequeno = {
                new Departamento("TI")
            };

            Diretor diretorInvalido =
                    new Diretor("Carlos", 9000, departamentoPequeno);

        } catch (RegraNegocioException e) {

            System.out.println("Erro: " + e.getMessage());
        }

        
        if (gerente != null && diretor != null) {

            Funcionario[] funcionarios = {
                analista,
                programador,
                auxiliar,
                analista2,
                programador2,
                gerente,
                diretor
            };

            imprimeRelatorio(funcionarios);
        }
    }
}
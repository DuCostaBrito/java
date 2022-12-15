package lista3;

import java.util.Scanner;

public class Principal {
    static final int nFuncs=2;

    public static void main(String args[]) {
        String nome, cargo;
        int dia, mes, ano, matricula, i;
        double salario;

        FuncionarioUfpr[] funcionarios = new FuncionarioUfpr[nFuncs];
        Scanner input = new Scanner(System.in);

        for (i = 0; i < nFuncs; i++) {
            System.out.print("Digite o nome do funcionario: ");
            nome = input.nextLine();

            System.out.print("Digite o cargo do funcionario: ");
            cargo = input.nextLine();

            System.out.print("Digite a data de nascimento do funcionario (dd/mm/aaaa): ");
            dia = input.nextInt();
            mes = input.nextInt();
            ano = input.nextInt();

            System.out.print("Digite a matricula do funcionario: ");
            matricula = input.nextInt();

            funcionarios[i] = new FuncionarioUfpr(nome, matricula, dia, mes, ano, cargo);
            System.out.print("\n");
        }

        FolhaDePagamentoUFPR[] lista = new FolhaDePagamentoUFPR[nFuncs];
        
        for (i = 0; i < nFuncs; i++) {
            System.out.print("Digite a data de pagamento do funcionario (mm/aaaa): ");
            mes = input.nextInt();
            ano = input.nextInt();

            System.out.print("Digite o salario do funcionario: ");
            salario = input.nextDouble();

            lista[i] = new FolhaDePagamentoUFPR(funcionarios[i], mes, ano, salario);
        }

        for (i = 0; i < nFuncs; i++)
            lista[i].exibirDados();

        input.close();
    }
}

package lista3;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        String nome, cargo;
        int dia, mes, ano, matricula;
        double salario;

        FuncionarioUfpr[] funcionarios = new FuncionarioUfpr[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do funcionario: ");
            nome = input.nextLine();

            System.out.print("Digite o cargo do funcionario: ");
            cargo = input.nextLine();

            System.out.print("Digite a data de nascimento do funcionario: ");
            dia = input.nextInt();
            mes = input.nextInt();
            ano = input.nextInt();

            System.out.print("Digite a matricula do funcionario: ");
            matricula = input.nextInt();

            funcionarios[i] = new FuncionarioUfpr(nome, matricula, dia, mes, ano, cargo);
        }
        
    }
}

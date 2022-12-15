package lista1;

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String args[]) {
        int multiplicador, soma;
        soma = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o multiplicador: ");
        multiplicador = input.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            soma = soma + (multiplicador * i);
        }
        System.out.println("A soma eh: " + soma);
        input.close();
    }
}

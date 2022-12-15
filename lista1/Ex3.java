package lista1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String args[]) {
        int num, soma;
        soma = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = input.nextInt();
        while (num != -1)
        {
            soma = soma + num;
            System.out.print("Digite um numero: ");
            num = input.nextInt();
        }        
        System.out.println("A soma eh: " + soma);
        input.close();
    }
}

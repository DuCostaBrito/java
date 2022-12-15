package lista2;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String args[]) {
        int numeros[], somaPares, qntImpares;
        numeros = new int[10];
        somaPares = 0;
        qntImpares = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma sequencia de 10 numeros: ");
        for (int i = 0; i < 10; i++)
        {
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0)
                somaPares = somaPares + numeros[i];
            else
                qntImpares = qntImpares + 1;
        }
        System.out.print("Numeros pares: ");
        for (int i = 0; i < 10; i++)
        {
            if (numeros[i] % 2 == 0)
                System.out.print(numeros[i] + " ");
        }
        System.out.println("\nSoma pares: " + somaPares);

        System.out.print("Numeros impares: ");
        for (int i = 0; i < 10; i++)
        {
            if (numeros[i] % 2 != 0)
                System.out.print(numeros[i] + " ");
        }
        System.out.println("\nQuantidade impares " + qntImpares);
        input.close();
    }
}

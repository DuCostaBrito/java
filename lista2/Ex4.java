package lista2;

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String args[]) {
        int[] array = new int[7];
        int maior, menor;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma sequencia de 7 numeros: ");
        for (int i = 0; i < 7; i++) 
            array[i] = input.nextInt();
        maior = menor = array[0];
        for (int i = 0; i < 7; i++) 
        {
            if (array[i] > maior)
                maior = array[i];
            if (array[i] < menor)
                menor = array[i];
        }
        System.out.printf("Maior: %d. Menor: %d \n", maior, menor);
        input.close();
    }
}

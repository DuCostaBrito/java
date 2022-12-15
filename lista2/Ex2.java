package lista2;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String args[]) {
        int matriz[][];
        int[] array = {0, 0, 0};
        matriz = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua matriz: ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matriz[i][j] = input.nextInt();
                array[j] = array[j] + matriz[i][j];
            }
        }

        System.out.print("Saida: ");
        for (int j = 0; j < 3; j++)
        {
            System.out.print(array[j] + " ");
        }
        input.close();
    }
}

package lista2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String args[]) {
        int[][] matriz = new int[4][4];
        int num, i, j;
        boolean existe = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva uma matriz 4x4: ");
        for (i = 0; i < 4; i++)
            for (j = 0; j < 4; j++)
                matriz[i][j] = input.nextInt();
        System.out.print("Numero a procurar: ");
        num = input.nextInt();
        for (i = 0; i < 4; i++)
            for (j = 0; j < 4; j++)
                if (matriz[i][j] == num) {
                    System.out.printf("Posicao: (%d, %d)\n", i + 1, j + 1);
                    existe = true;
                }
        if (!existe)
            System.out.println("elemento nao encontrado");
        input.close();

    }
}

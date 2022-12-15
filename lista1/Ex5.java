package lista1;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String args[]) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = input.nextInt();
        if ((0 <= num) && (num < 5))
            f1(num);
        else if ((5 <= num) && (num < 10))
            f2(num);
        else
            f3(num);
        input.close();

    }

    public static void f1(int num) {
        int resultado;
        resultado = num;
        System.out.println("Resultado: " + resultado);
    }

    public static void f2(int num) {
        int resultado;
        resultado = 2 * num + 1;
        System.out.println("Resultado: " + resultado);
    }

    public static void f3(int num) {
        int resultado;
        resultado = num - 3;
        System.out.println("Resultado: " + resultado);
    }
}

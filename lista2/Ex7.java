package lista2;

import java.util.Scanner;

public class Ex7 {
    
    public static void main(String args[]) {
        String frase1, frase2;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira frase:");
        frase1 = input.nextLine();
        System.out.println("Digite a segunda frase:");
        frase2 = input.nextLine();

        frase1 = frase1.replace('a', '*');
        frase2 = frase2.replace('a', '*');

        System.out.println("Primeira frase invertida");
        invert(frase1);
        System.out.println("Segunda frase invertida");
        invert(frase2);
        input.close();
    }

    public static void invert(String frase) {
        int length = frase.length();
        for(int i = 1; i <= length; i++)
            System.out.print(frase.charAt(length - i));
        System.out.print("\n");
    }
}

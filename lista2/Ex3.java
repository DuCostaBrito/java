package lista2;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String args[]) {
        String palavra;
        char c, consoante;
        int length, qntVogal;
        qntVogal = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva uma palavra: ");
        palavra = input.nextLine();
        length = palavra.length();
        for (int i = 0; i < length; i++)
        {
            c = palavra.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) 
                qntVogal += 1;
        }
        System.out.print("Escreva uma letra consoante para substituir 'a': ");
        consoante = input.next().charAt(0);
        System.out.println("Numero de vogais na palavra: " + qntVogal);
        System.out.println("Nova palavra: " + palavra.replace('a', consoante));
        input.close();
    }
}

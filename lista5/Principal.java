package lista5;

import java.util.Scanner;

public class Principal {
    
    public static void main(String args[]) {
        int i;
        String name, destinatario;
        name = "Eduardo";
        Scanner input = new Scanner(System.in);
        CartaoWeb[] cartoes = new CartaoWeb[4];
        
        System.out.print("\nInsira o nome do destinatario: ");
        destinatario = input.nextLine();
        cartoes[0] = new CartaoAniversario(destinatario);

        System.out.print("\nInsira o nome do destinatario: ");
        destinatario = input.nextLine();
        cartoes[1] = new CartaoNatal(destinatario);

        System.out.print("\nInsira o nome do destinatario: ");
        destinatario = input.nextLine();
        cartoes[2] = new CartaoDiaDosNamorados(destinatario);

        System.out.print("\nInsira o nome do destinatario: ");
        destinatario = input.nextLine();
        cartoes[3] = new CartaoAniversario(destinatario);
        input.close();
        for (i = 0; i < 4; i++)
            cartoes[i].retornarMensagem(name);


    }
}

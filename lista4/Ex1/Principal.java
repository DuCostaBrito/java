package lista4.Ex1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int i = 0;
        char c;
        Fluorescente lampadaF = new Fluorescente();
        Led lampadaL = new Led();
        Scanner input = new Scanner(System.in);
        while (i < 10) {
            System.out.print("Escolha uma lampada (F = fluorescente, L = Led): ");
            c = input.next().charAt(0);
            if (c == 'f'){
                lampadaF.setLigado();
                if (lampadaF.isLigado())
                    System.out.println("Estado fluorescente: Ligado");
                else    
                    System.out.println("Estado fluorescente: Desligado");
            }
            else if (c == 'l'){
                lampadaL.setLigado();
                if (lampadaL.isLigado())
                    System.out.println("Estado Led: Ligado");
                else    
                    System.out.println("Estado Led: Desligado");
            }
            i++;
        }

        input.close();
    }
}

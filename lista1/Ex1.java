package lista1;

import java.util.Scanner;

public class Ex1 {

    public static void main (String args[]) { 
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print ("Digite um numero: ");
        num = input.nextInt();
        if (num >= 0)
            System.out.println(num + " eh positivo");
        else
            System.out.println(num + " eh negativo");
        input.close();
    }

}
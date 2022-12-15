package lista1;
import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um numero: ");
        num = input.nextInt();
        if ((num % 2) == 0)
            System.out.println(num + " eh par");
        else
            System.out.println(num + " eh impar");
        input.close();

    }
}

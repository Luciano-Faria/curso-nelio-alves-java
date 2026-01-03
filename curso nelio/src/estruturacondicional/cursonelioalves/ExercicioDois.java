package estruturacondicional.cursonelioalves;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nmr;
        System.out.println("Digite um numero: ");
        nmr = sc.nextInt();

        if (nmr < 0) {
            System.out.println("Seu numero é negativo: ");
        } else if (nmr > 0) {
            System.out.println("Seu numero é positivo: ");
        } else {
            System.out.println("Seu numero é 0");
        }

        sc.close();
    }
}

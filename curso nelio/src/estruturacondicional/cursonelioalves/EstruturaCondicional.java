package estruturacondicional.cursonelioalves;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hora;

        System.out.println("Que horas é agora? ");

        hora = sc.nextDouble();

        if (hora <= 12) {
            System.out.println("Bom diaaa");
        } else if (hora < 18) {
            System.out.println("Boa tardeee");
        } else {
            System.out.println("Boa noite");
        }
        sc.close();
    }
}

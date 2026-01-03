package estruturacondicional.cursonelioalves;

import java.util.IllegalFormatCodePointException;
import java.util.Locale;
import java.util.Scanner;

public class TreinandoIfElse {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.println("Digite sua nota: ");
        nota = sc.nextDouble();

        if (nota >= 6) {
            System.out.println("Voce esta aprovado!!");
        } else {
            System.out.println("Voce esta reprovado!!");
        }
    }
}

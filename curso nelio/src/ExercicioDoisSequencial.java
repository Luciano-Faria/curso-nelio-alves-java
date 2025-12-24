import java.util.Locale;
import java.util.Scanner;

public class ExercicioDoisSequencial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1, peca2, numeroP1, numeroP2;
        double valor1, valor2, resultado1, resultado2,valorFinal;

        System.out.println("Digite os valores da primeira peça.");
        peca1 = sc.nextInt();
        numeroP1 = sc.nextInt();
        valor1 = sc.nextDouble();

        System.out.println("Digite o valor da segunda peça. ");
        peca2 = sc.nextInt();
        numeroP2 = sc.nextInt();
        valor2 = sc.nextDouble();

        resultado1 = numeroP1 * valor1;
        resultado2 = numeroP2 *valor2;
        valorFinal = resultado1 + resultado2;

        System.out.println("Valor a ser pago: " + valorFinal);

        sc.close();
    }
}

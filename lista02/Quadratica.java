package lista02;

import java.util.Date;
import java.util.Scanner;

public class Quadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.println("Digite o valor de C: ");
        double c = sc.nextDouble();

        Double delta = b * b - 4 * a * c;

        System.out.println("O resultado é"+ delta);
    }
}

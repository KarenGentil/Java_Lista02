package lista02;

import java.util.Scanner;

public class Geometrica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numumero1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numumero2 = sc.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numumero3 = sc.nextDouble();

        double mediaGeometrica = Math.cbrt(numumero1*numumero2*numumero3);

        System.out.println("A média geometrica dos números é: " + mediaGeometrica);
    }
}

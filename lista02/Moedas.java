package lista02;

import java.util.Scanner;

public class Moedas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Taxa um valor em reais: ");
        double reais = sc.nextDouble();

        System.out.println("Taxa um valor em Dolar: ");
        double dolar = sc.nextDouble();

        System.out.println("Taxa um valor em Euro: ");
        double euro = sc.nextDouble();

        System.out.println("Taxa um Libra: ");
        double libra = sc.nextDouble();

        System.out.printf("Dólares: US$ %.2f%n", reais * dolar);
        System.out.printf("Euros: € %.2f%n", reais * euro);
        System.out.printf("Libras: £ %.2f%n", reais * libra);

        sc.close();

    }
}

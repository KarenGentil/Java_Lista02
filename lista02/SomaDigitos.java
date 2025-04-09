package lista02;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        numero =  Math.abs(numero);

        int soma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            soma += digito;
            numero /= 10;
        }

        System.out.println("A soma dos digitos " + soma);

    }
}

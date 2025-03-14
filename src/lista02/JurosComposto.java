package lista02;

import java.util.Scanner;

public class JurosComposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos dados
        System.out.println("Digite o valor do capital inicial:");
        float capitalInicial = sc.nextFloat();

        System.out.println("Digite o valor da taxa de juros anual (em %):");
        float jurosAnual = sc.nextFloat() / 100; // Convertendo de porcentagem para decimal

        System.out.println("Digite o número de anos:");
        int numeroAnos = sc.nextInt();

        // Cálculo do montante com juros compostos
        double valorFinal = capitalInicial * Math.pow(1 + jurosAnual, numeroAnos);

        // Saída do resultado formatado
        System.out.printf("O montante final é: R$ %.2f%n", valorFinal);

        sc.close();
    }
}

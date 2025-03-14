package lista02;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base = sc.nextFloat();
        System.out.println("Valor da base: ");

        float altura = sc.nextFloat();
        System.out.println("Valor da altura: ");

        float area = base*altura/2;

        System.out.println("Cálculo de Área e Perímetro do Triângulo é: " + area);

    }
}

package lista02;

import java.util.Scanner;

public class Ponderada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 =sc.nextFloat();
        System.out.println("Digite o peso da primeira nota: ");
        int peso1 =sc.nextInt();

        System.out.println("Digite a segunda nota:");
        float nota2 =sc.nextFloat();
        System.out.println("Digite o peso da segunda nota:");
        int peso2 =sc.nextInt();

        System.out.println("Digite a terceira nota:");
        float nota3 =sc.nextFloat();
        System.out.println("Digite o peso da terceira nota:");
        int peso3 =sc.nextInt();

        float resposta = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) )/ (peso1 + peso2 + peso3);

        System.out.println("A média ponderada das notas é: "+resposta);

        sc.close();


    }
}

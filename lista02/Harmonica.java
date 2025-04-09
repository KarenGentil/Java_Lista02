package lista02;

    import java.util.Scanner;

public class Harmonica {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o 2° numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("Digite o 3° numero: ");
        double numero3 = sc.nextDouble();

        double media = 3 / ((1 / numero1) + (1 / numero2) + (1 / numero3));


        System.out.println("A média harmônica dos números é: " + media);
    }
}

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num1, num2;
        System.out.println("Fale-me dois números...");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0|| num2 % num1 == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não São Multiplos");
        }

        sc.close();
    }
}

// Não Sabia com saber se um número é multiplo ou não 
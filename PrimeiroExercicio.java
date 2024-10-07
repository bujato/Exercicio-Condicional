import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num;
        System.out.println("Fale-me um número, aí...");
        num = sc.nextInt();

        if(num < 0) {
            System.out.println("NÚMERO NEGATIVO");
        } else {
            System.out.println("NÚMERO NÃO NEGATIVO");
        }

        sc.close();
    }
}
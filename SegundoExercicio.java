import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num;
        System.out.println("Fale-me um número...");
        num = sc.nextInt();

        if(num / 2 == 0) {
            System.out.println("NÚMERO PAR");
        } else {
            System.out.println("NÚMERO ÍMPAR"); 
        }

        sc.close();
    }
}

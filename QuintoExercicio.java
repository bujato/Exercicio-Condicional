import java.util.Locale;
import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int codigo, qtde;
        double valorTotal;

        codigo = sc.nextInt();
        qtde = sc.nextInt();

        if (codigo == 1) {
            valorTotal = qtde * 4.0;
        } else if (codigo == 2) {
            valorTotal = qtde * 4.5;
        } else if (codigo == 3){
            valorTotal = qtde * 5.0;
        } else if (codigo == 4) {
            valorTotal = qtde * 2.0;
        } else {
            valorTotal = qtde * 1.50;
        } 

        System.out.printf("O Total deu: R$ %.2f%n", valorTotal);
        sc.close();
    }
}

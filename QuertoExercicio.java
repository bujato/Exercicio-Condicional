import java.util.Scanner;

public class QuertoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int inicio, fim;
        inicio = sc.nextInt();
        fim = sc.nextInt();

        int duracao;
        if(inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio - fim;
        }

        System.out.println("O JOGO " + duracao + " HORA(S)");

        sc.close();
    }
}

// Não entendi nada do exercicío 

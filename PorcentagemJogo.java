import java.util.Scanner;

public class PorcentagemJogo {

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int fases_total = 0;
    int fases_completas = 0;
    double porcentagem;

    System.out.println("Digite a quantidade de fases que o jogo possui: ");
    fases_total = teclado.nextInt();

    System.out.println("Digite quantas fases que você completou: ");
    fases_completas = teclado.nextInt();

    porcentagem = (fases_completas * 100) / fases_total; 


    System.out.println("O número de fases que completou equivale a " + porcentagem + "% do jogo!");

    teclado.close();
    }
}
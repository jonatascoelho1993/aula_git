
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Lista de filmes
        String[] filmes = {
            "1 - Michael Jackson",
            "2 - Carros 2",
            "3 - Minha mãe é uma peça",
            "4 - Madagascar 4"
        };

        System.out.println("===== CINEMA =====");
        System.out.println("Escolha seu filme:");

        for (String filme : filmes) {
            System.out.println(filme);
        }

        int escolha;
        do {
            System.out.print("Digite o número do filme: ");
            escolha = entrada.nextInt();
        } while (escolha < 1 || escolha > filmes.length);

        // Escolha da sessão
        System.out.println("\nEscolha a sessão:");
        System.out.println("1 - 14:30");
        System.out.println("2 - 16:15");
        System.out.println("3 - 19:00");
        System.out.println("4 - 21:45");

        int sessao;
        do {
            System.out.print("Digite o número da sessão: ");
            sessao = entrada.nextInt();
        } while (sessao < 1 || sessao > 4);

        // Quantidade de ingressos
        System.out.print("\nQuantidade de ingressos inteiros: ");
        int inteira = entrada.nextInt();

        System.out.print("Quantidade de meias-entradas: ");
        int meia = entrada.nextInt();

        // Cálculo do valor
        double total = (inteira * 32) + (meia * 16);

        // Resultado
        System.out.println("\n===== RESUMO DA COMPRA =====");
        System.out.println("Filme: " + filmes[escolha - 1]);
        System.out.println("Sessão: " + (sessao == 1 ? "14:30" :
                           sessao == 2 ? "16:15" :
                           sessao == 3 ? "19:00" : "21:45"));

        System.out.println("Ingressos inteiros: " + inteira);
        System.out.println("Meias-entradas: " + meia);
        System.out.printf("Total a pagar: R$ %.2f%n", total);


        entrada.close();
    }
}

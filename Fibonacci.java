import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série de Fibonacci que você deseja gerar: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Série de Fibonacci até o " + n + "º termo:");
            gerarFibonacci(n);
        }

        scanner.close();
    }

    public static void gerarFibonacci(int n) {
        int primeiro = 0, segundo = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println(); // Para pular para a linha seguinte após a série
    }
}

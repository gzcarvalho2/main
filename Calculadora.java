import java.util.Scanner;

public class Calculadora {

    // Métodos para as operações matemáticas
    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("ERRO: Divisão por Zero!");
            return Double.NaN; // Retorna NaN para indicar erro
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Qual operação você quer fazer?");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            System.out.print("Escolha uma das opções: (1/2/3/4): ");
            int esc = scanner.nextInt();

            System.out.print("Entre com um número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Entre com um segundo número: ");
            double n2 = scanner.nextDouble();

            double resultado = Double.NaN; // Usado para detectar erro de divisão por zero
            boolean operacaoValida = true;

            switch (esc) {
                case 1:
                    resultado = adicionar(n1, n2);
                    System.out.println("O resultado da soma é igual a: " + resultado);
                    break;
                case 2:
                    resultado = subtrair(n1, n2);
                    System.out.println("O resultado da subtração é igual a: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(n1, n2);
                    System.out.println("O resultado da multiplicação é igual a: " + resultado);
                    break;
                case 4:
                    resultado = dividir(n1, n2);
                    if (Double.isNaN(resultado)) {
                        operacaoValida = false;
                    } else {
                        System.out.println("O resultado da divisão é igual a: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    operacaoValida = false;
                    break;
            }

            if (operacaoValida) {
                System.out.print("Deseja sair? (S - SIM / N - NÃO): ");
                char sair = scanner.next().charAt(0);

                if (sair == 'S' || sair == 's') {
                    System.out.println("Obrigado por usar a calculadora!");
                    continuar = false;
                }
            } else {
                System.out.println("Tente novamente com uma operação válida.");
            }
        }

        scanner.close();
    }
}

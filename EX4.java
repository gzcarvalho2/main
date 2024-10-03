package EXERCÍCIOS;
import java.util.Scanner;


public class EX4 {

    public char letra;

    Scanner scanner = new Scanner(System.in);

    public void insira_Letra(){
        System.out.println("-------------------------------");
        System.out.println("Digite uma letra abaixo:");
        letra = scanner.nextLine().charAt(0);
    }

    public void confere_Letra() {
        switch (letra) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("-------------------------------");
                System.out.println("É vogal!!");
                break;
            default:
                System.out.println("-------------------------------");
                System.out.println("CONSOANTE");
                break;
        }
    }
}

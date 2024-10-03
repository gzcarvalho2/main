package EXERCÍCIOS;
import java.util.Scanner;

public class EX6 {

    public int dia;

    Scanner scanner = new Scanner(System.in);

    public void insira_Dia(){
        System.out.println("Insira um numero de 1 até 7 para saber o respectivo dia:");
        dia = scanner.nextInt();
    }

    public void Conferir_dia(){
        switch (dia){
            case 1:
                System.out.println("-------------------------------");
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("-------------------------------");
                System.out.println("Segunda-Feira");
                break;

            case 3:
                System.out.println("-------------------------------");
                System.out.println("Terça-Feira");
                break;

            case 4:
                System.out.println("-------------------------------");
                System.out.println("Quarta-Feira");
                break;

            case 5:
                System.out.println("-------------------------------");
                System.out.println("Quinta-Feira");

            case 6:
                System.out.println("-------------------------------");
                System.out.println("Sexta-Feira");
                break;

            case 7:
                System.out.println("-------------------------------");
                System.out.println("Sábado");
                break;

            default:
                System.out.println("-------------------------------");
                System.out.println("VALOR INVÁLIDO");
                break;
        }
    }
}

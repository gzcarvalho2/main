package EXERCÍCIOS;
import java.util.Scanner;

public class EX1 {

    private String nome;
    private char periodo;

    Scanner scanner = new Scanner(System.in);

    public void perguntaNome() {
        System.out.println("-------------------------------");
        System.out.println("Digite seu nome abaixo:");
        nome = scanner.nextLine();
    }

    public void escolhePeriodo() {
        System.out.println("-------------------------------");
        System.out.println("Escolha o período \nV - Vespertino \nM - Matutino\nN - Noturno");
        periodo = scanner.next().charAt(0);
    }

    public String getNome() {
        return nome;
    }

    public char getPeriodo() {
        return periodo;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeriodo(char periodo) {
        this.periodo = periodo;
    }
}



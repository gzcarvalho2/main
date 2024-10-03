package EXERCÍCIOS;
import java.util.Scanner;
public class Num_Primo {
    private int num;

    Scanner scanner = new Scanner(System.in);

    public void Pergunta_Num(){
        System.out.println("Digite um número e saiba se ele é primo ou não: ");
        num = scanner.nextInt();
    }

    public void Confere_num(){
        if (num/num == 0 | num/1 == 0){
            System.out.println("É PRIMO!!");
        }else{
            System.out.println("NÃO É PRIMO");
        }
    }
}
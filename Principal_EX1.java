package EXERCÍCIOS;


public class Principal_EX1 {

    public static void main(String[] args) {
        EX1 ex1 = new EX1();

        ex1.perguntaNome();
        ex1.escolhePeriodo();


            switch (ex1.getPeriodo()) {
                case 'V':
                case 'v':
                    System.out.println("-------------------------------");
                    System.out.println("Boa tarde," + ex1.getNome() + "!");
                    break;
                case 'M':
                case 'm':
                    System.out.println("-------------------------------");
                    System.out.println("Bom dia," + ex1.getNome() + "!");
                    break;
                case 'N':
                case 'n':
                    System.out.println("-------------------------------");
                    System.out.println("Boa noite," + ex1.getNome() + "!");
                    break;
                default:
                    System.out.println("-------------------------------");
                    System.out.println("Período inválido.");
                    break;
            }
        }
    }
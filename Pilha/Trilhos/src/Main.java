import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trilhos teste = new Trilhos();
        String formacao;
        int num = scanner.nextInt();
        while (num!=0){
            scanner.nextLine();
            formacao = scanner.nextLine();
            while (!formacao.equals("0")){
                if (teste.gerenciar(num, formacao)){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                formacao = scanner.nextLine();
            }
            System.out.println();
            num = scanner.nextInt();
        }
    }
}
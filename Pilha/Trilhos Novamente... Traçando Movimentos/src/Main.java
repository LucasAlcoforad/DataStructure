import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trilhos teste = new Trilhos();
        int num = scanner.nextInt();
        while(num!=0){
            scanner.nextLine();
            String entrada = scanner.nextLine();
            String saida = scanner.nextLine();
            teste.gerenciar(num, entrada,saida);
            System.out.println(teste.comandos);
            num = scanner.nextInt();
        }
    }
}
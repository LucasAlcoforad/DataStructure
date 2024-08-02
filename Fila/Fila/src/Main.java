import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FilaDeIngressos teste = new FilaDeIngressos();
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextLine();
        String fila = scanner.nextLine();
        scanner.nextInt();
        scanner.nextLine();
        System.out.println(teste.gerenciar(fila,scanner.nextLine()));
    }
}
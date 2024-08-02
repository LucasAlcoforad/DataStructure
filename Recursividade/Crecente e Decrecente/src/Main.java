import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        recursiveCheckOrder(scanner);
        scanner.close();
    }
    public static void recursiveCheckOrder(Scanner scanner) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x == y) {
            return;
        }
        if (x < y) {
            System.out.println("Crescente");
        } else {
            System.out.println("Decrescente");
        }
        recursiveCheckOrder(scanner);
    }
}


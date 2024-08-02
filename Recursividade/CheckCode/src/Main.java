import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        recursiveCheckCode(scanner);
        scanner.close();
    }
    public static void recursiveCheckCode(Scanner scanner) {
        int x = scanner.nextInt();
        if (x == 2002) {
            System.out.println("Acesso Permitido");
            return;
        } else {
            System.out.println("Senha Invalida");
            recursiveCheckCode(scanner);
        }
    }
}

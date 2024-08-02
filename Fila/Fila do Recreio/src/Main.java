import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        FilaDoRecreio teste = new FilaDoRecreio();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1;i<=num;i++){
            scanner.nextInt();
            scanner.nextLine();
            System.out.println(teste.gerenciar(scanner.nextLine()));
        }
    }
}
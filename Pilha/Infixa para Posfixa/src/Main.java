import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PilhaPos teste = new PilhaPos();
        Scanner scanner = new Scanner(System.in);
        int numExpressoes = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0 ; i < numExpressoes ; i++){
            teste.posfixar(scanner.nextLine());
            teste.show();
        }
    }
}
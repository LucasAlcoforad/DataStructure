import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baralho teste = new Baralho();
        int num = scanner.nextInt();
        while (num!=0){
            System.out.println(teste.jogar(num));
            System.out.println(teste.baralho.show());
            num = scanner.nextInt();
        }
    }
}
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Trocador primeiro = new Trocador();
        Scanner scanner = new Scanner(System.in);
        primeiro.jogar(scanner);
        System.out.println(primeiro);
    }
}
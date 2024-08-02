import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pokedex kanto = new Pokedex();
        Scanner scanner = new Scanner(System.in);
        int vezes = 0;
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        while (vezes<quantidade){
            kanto.add(scanner.nextLine());
            vezes++;
        }
        System.out.printf("Falta(m) %d pomekon(s).%n", 151 - kanto.tamanho);
    }
}
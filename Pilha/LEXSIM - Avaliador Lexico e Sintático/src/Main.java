import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilhaPos teste = new PilhaPos();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            if (linha.equals("EOF")) {
                break;
            }
            teste.posfixar(linha);
            teste.show();
        }
    }
}
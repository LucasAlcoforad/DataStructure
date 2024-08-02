import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            ListaDeLista turma = new ListaDeLista();
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
            }
            int contador = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < contador; i++) {
                turma.add(scanner.nextLine());
            }
            turma.show();
        }
    }

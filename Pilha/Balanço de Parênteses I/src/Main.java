import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        Pilha teste = new Pilha();
        while (scanner.hasNextLine()) {
            teste.verificar(scanner.nextLine());
        }
        scanner.close();
    }
}
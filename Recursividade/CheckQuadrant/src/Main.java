import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        recursiveCheckQuadrant (scanner);
        scanner.close();
    }
    public static void recursiveCheckQuadrant(Scanner scanner) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x==0||y==0){
            return;
        }
        if (x>0){
            if(y>0){
                System.out.println("primeiro");
                recursiveCheckQuadrant(scanner);
            } else {
                System.out.println("quarto");
                recursiveCheckQuadrant(scanner);
            }
        } else {
            if(y>0){
                System.out.println("segundo");
                recursiveCheckQuadrant(scanner);
            } else {
                System.out.println("terceiro");
                recursiveCheckQuadrant(scanner);
            }
        }
    }
}
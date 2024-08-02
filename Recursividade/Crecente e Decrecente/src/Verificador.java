public class Verificador {
    public static String Crecente(int x, int y){
        if(x<y){
            return "Decrescente";
        } else if(x>y){
            return "Crescente";
        } else {
            return "";
        }
    }
}

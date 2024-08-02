public class No {
    public No anterior;
    public String dado;
    public int prioridade;
    public boolean paren;

    public No(String dado) {
        this.dado=dado;
        switch (dado) {
            case "+", "-" -> this.prioridade = 1;
            case "*", "/" -> this.prioridade = 2;
            case "^" -> this.prioridade = 3;
            default -> this.prioridade = 0;
        }
        this.paren = false;
    }
}

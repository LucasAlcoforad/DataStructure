public class No {
    public No anterior;
    public String dado;
    public int prioridade;
    public boolean paren;

    public No(String dado) {
        this.dado=dado;
        if (dado.matches("^[a-zA-Z0-9]+$")){
            this.prioridade = 1;
        } else {
            switch (dado) {
                case "(", ")"-> this.prioridade = 1;
                case "|" -> this.prioridade = 2;
                case "." -> this.prioridade = 3;
                case "<", ">", "=", "#" -> this.prioridade = 4;
                case "+", "-" -> this.prioridade = 5;
                case "*", "/" -> this.prioridade = 6;
                case "^" -> this.prioridade = 7;
                default -> this.prioridade = 0;
            }
        }
        this.paren = false;
    }
}

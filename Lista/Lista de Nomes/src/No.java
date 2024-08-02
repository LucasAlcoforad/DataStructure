public class No {
    public No anterior;
    public String nome;
    public No proximo;

    public No(String nome) {
        this.proximo = this;
        this.nome = nome;
        this.anterior = this;
    }
}

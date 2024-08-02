public class No {
    public  No anterior;
    public String pokemon;
    public No proximo;

    public No(String pokemon) {
        this.anterior = null;
        this.pokemon = pokemon;
        this.proximo = null;
    }
}

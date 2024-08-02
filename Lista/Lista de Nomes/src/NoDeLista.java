public class NoDeLista {
    public NoDeLista anterior;
    public Lista lista;
    public NoDeLista proximo;

    public NoDeLista(String n) {
        this.anterior = this;
        this.lista = new Lista(n);
        this.proximo = this;
    }
}

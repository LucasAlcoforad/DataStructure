public class ListaDeLista {
    public NoDeLista primeiro;
    public NoDeLista ultimo;
    public void add(String x) {
        if (primeiro == null) {
            NoDeLista novo = new NoDeLista(x);
            primeiro = novo;
            ultimo = novo;
        } else {
            NoDeLista aux = primeiro;
            while (aux.proximo != primeiro) {
                if (aux.lista.add(x)) {
                    return;
                }
                aux = aux.proximo;
            }
            NoDeLista novo = new NoDeLista(x);
            novo.proximo = primeiro;
            novo.anterior = ultimo;
            aux.proximo = novo;
            primeiro.anterior = novo;
            ultimo = novo;
        }
    }

    public void show(){
        NoDeLista aux=primeiro;
        while (aux.proximo!=primeiro){
            aux.lista.show();
            aux=aux.proximo;
        }
        aux.lista.show();
    }
}

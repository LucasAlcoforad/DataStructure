public class Fila {
    public No primeiro;
    public No ultimo;

    public Fila(int num) {
        for (int i=1;i<=num;i++){
            this.add(i);
        }
    }

    public Fila() {
    }

    public void add(int dado){
        No novo = new No(dado);
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            ultimo = novo;
        }
    }
    public void add(No novo){
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            ultimo = novo;
        }
    }
    public void pop(){
        if (primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.prox;
        }
    }

    public String show(){
        No aux = primeiro;
        String cartas = "Remaining card: ";
        while (aux!=null){
            if (aux.prox!=null){
                cartas = cartas + aux.dado + ", ";
                aux = aux.prox;
            } else {
                cartas = cartas + aux.dado;
                aux = aux.prox;
            }
        }
        return cartas;
    }
}

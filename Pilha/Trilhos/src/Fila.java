public class Fila {
    public No primeiro;
    public No ultimo;

    public Fila(int quant) {
        for (int i=1;i<=quant;i++){
            this.push(i);
        }
    }

    public Fila() {
        primeiro = null;
        ultimo = null;
    }

    public void push(int i){
        No novo = new No(i);
        if (primeiro==null){
            primeiro = novo;
            ultimo = novo;
        } else  {
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
}

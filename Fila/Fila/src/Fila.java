public class Fila {
    public No primeiro;
    public No ultimo;

    public Fila(String[] numeros) {
        for ( int i=0 ; i<numeros.length ; i++ ){
            this.add(numeros[i]);
        }
    }

    public void add(String dado){
        No novo = new No(dado);
        if (primeiro==null){
            primeiro = novo;
        } else {
            ultimo.prox = novo;
        }
        ultimo = novo;
    }

    public void remove(){
        if (primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.prox;
        }
    }
}

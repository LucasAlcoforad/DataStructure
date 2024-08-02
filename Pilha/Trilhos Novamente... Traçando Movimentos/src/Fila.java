public class Fila {
    public No primeiro;
    public No ultimo;

    public Fila(String dado) {
        String[] entrada = dado.split(" ");
        for (int i=0;i< entrada.length;i++){
            this.push(entrada[i]);
        }
    }

    public void push(String dado){
        No novo = new No(dado);
        if (primeiro==null){
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
    public boolean verificar(){
        if(primeiro==null){
            return false;
        } else {
            return true;
        }
    }
}

public class Pilha {
    public No topo;
    public No fundo;


    public void push(int i){
        No novo = new No(i);
        if (topo == null){
            topo = novo;
            fundo = novo;
        } else {
            novo.prox = topo;
            topo = novo;
        }
    }

    public void pop(){
        if (topo == fundo){
            topo = null;
            fundo = null;
        } else {
            topo = topo.prox;
        }
    }
}

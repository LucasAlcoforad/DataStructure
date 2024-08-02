public class PilhaOp {
    public No fundo;
    public No topo;

    public void push(No novo){
        if(topo==null){
            topo=novo;
            fundo=topo;
        } else {
            novo.anterior=topo;
            topo=novo;
        }
    }
    public void pop(){
        if(topo==fundo){
            topo=null;
            fundo=null;
        } else {
            topo=topo.anterior;
        }
    }
    public boolean isEmpty() {
        return topo == null;
    }
}

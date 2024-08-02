public class PilhaParen {
    public NoParen topo;
    public NoParen fundo;

    public void push(){
        NoParen novo = new NoParen();
        if (topo==null){
            topo=novo;
            fundo=novo;
        } else {
            novo.anterior=topo;
            topo=novo;
        }
        fundo.anterior=topo;
    }
    public void pop(){
        if(topo==fundo){
            topo=null;
            fundo=null;
        } else {
            topo=topo.anterior;
            fundo.anterior=topo;
        }
    }
    public void show(){
        NoParen aux = topo;
        do {
            System.out.println(aux.dado);
            aux=aux.anterior;
        } while (aux!=topo);
    }
    public boolean empty(){
        if (topo==null){
            return true;
        } else {
            return false;
        }
    }
    public void verificar(String f){
        char[] carac = f.toCharArray();
        boolean br = false;
        for (char c : carac){
            if (c=='(') {
                this.push();
            } else if (c == ')') {
                if (topo==null){
                    br=true;
                    break;
                } else {
                    this.pop();
                }
            }
        }
        if (!br){
            if (this.empty()){
            } else {
            }
        }
        this.topo=null;
        this.fundo=null;
    }
}
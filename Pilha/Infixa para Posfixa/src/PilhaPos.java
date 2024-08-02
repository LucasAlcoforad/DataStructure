public class PilhaPos {
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
        topo=topo.anterior;
    }

    public void posfixar(String exp){
        PilhaOp pilhaO = new PilhaOp();
        boolean paren = false;
        for (char carac : exp.toCharArray()){
            String scarac = new String(new char[]{carac});
            No novo = new No(scarac);
            if (novo.prioridade == 0){
                if (novo.dado.equals(")")){
                    while(!topo.anterior.dado.equals("(")){
                        StringBuilder str = new StringBuilder();
                        str.append(topo.anterior.dado).append(topo.dado).append(pilhaO.topo.dado);
                        No conca = new No(str.toString());
                        this.pop();
                        this.pop();
                        pilhaO.pop();
                        this.push(conca);
                    }
                    topo.anterior.dado = topo.dado;
                    this.pop();
                } else {
                    this.push(novo);
                }
            } else {
                if (pilhaO.topo==null||novo.prioridade>pilhaO.topo.prioridade){
                    pilhaO.push(novo);
                } else {
                    if (topo.anterior != null){
                        if (pilhaO.topo.anterior!=null){
                            while (pilhaO.topo!=null && pilhaO.topo.prioridade >= novo.prioridade && !topo.anterior.dado.equals("(")){
                                StringBuilder str = new StringBuilder();
                                str.append(topo.anterior.dado).append(topo.dado).append(pilhaO.topo.dado);
                                No conca = new No(str.toString());
                                this.pop();
                                this.pop();
                                pilhaO.pop();
                                this.push(conca);
                            }
                            pilhaO.push(novo);
                        } else {
                            StringBuilder str = new StringBuilder();
                            str.append(topo.anterior.dado).append(topo.dado).append(pilhaO.topo.dado);
                            No conca = new No(str.toString());
                            this.pop();
                            this.pop();
                            pilhaO.pop();
                            this.push(conca);
                            pilhaO.push(novo);
                        }
                    } else {
                        pilhaO.push(novo);
                    }
                }
            }

        }
        while (topo.anterior!=null){
            StringBuilder str = new StringBuilder();
            str.append(topo.anterior.dado).append(topo.dado).append(pilhaO.topo.dado);
            No conca = new No(str.toString());
            this.pop();
            this.pop();
            pilhaO.pop();
            this.push(conca);
        }
    }
    public void show(){
        No aux = topo;
        while (aux!=null){
            System.out.println(aux.dado);
            aux=aux.anterior;
        }
        this.topo = null;
        this.fundo = null;
    }
}

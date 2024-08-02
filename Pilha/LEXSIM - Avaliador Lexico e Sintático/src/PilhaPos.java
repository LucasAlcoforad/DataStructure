class PilhaPos {
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
        if (topo==fundo){
            topo = null;
            fundo = null;
        } else {
            topo=topo.anterior;
        }
    }

    public void posfixar(String exp){
        PilhaOp pilhaO = new PilhaOp();
        PilhaParen pilhaP = new PilhaParen();
        boolean operador = false;
        boolean operando = false;
        boolean quebra = false;
        for (char carac : exp.toCharArray()) {
            String scarac = String.valueOf(carac);
            No novo = new No(scarac);
            if (novo.prioridade==0){
                //erro lexico
                novo.dado="Lexical Error!";
                topo=novo;
                fundo=novo;
                quebra=true;
                pilhaP.topo=null;
                pilhaP.fundo=null;
                pilhaO.topo=null;
                pilhaO.fundo=null;
                break;
            } else if (novo.prioridade==1){
                //operando e parenteses
                if (novo.dado.equals("(")){
                    if (operando){
                        //erro sintatico (abrir paren apos numero)
                        novo.dado="Syntax Error!";
                        topo=novo;
                        fundo=novo;
                        quebra=true;
                        pilhaP.topo=null;
                        pilhaP.fundo=null;
                        pilhaO.topo=null;
                        pilhaO.fundo=null;
                        break;
                    } else {
                        this.push(novo);
                        pilhaP.push();
                    }
                } else if (novo.dado.equals(")")) {
                    if (topo==null||topo.dado.equals("(" )||operador||pilhaP.empty()){
                        // erro sintatico (paren vazio, fechar paren apos um operador, começar com pare fechando, n ter paren abrindo)
                        novo.dado="Syntax Error!";
                        topo=novo;
                        fundo=novo;
                        quebra=true;
                        pilhaP.topo=null;
                        pilhaP.fundo=null;
                        pilhaO.topo=null;
                        pilhaO.fundo=null;
                        break;
                    }else{
                        while (!topo.anterior.dado.equals("(")){
                            No conca = new No(topo.anterior.dado+topo.dado+pilhaO.topo.dado);
                            this.pop();
                            this.pop();
                            pilhaO.pop();
                            this.push(conca);
                        }
                        topo.anterior.dado= topo.dado;
                        this.pop();
                        pilhaP.pop();
                    }
                } else {
                    //numeros ou letras
                    if (topo!=null){
                        if (topo.dado.equals(")") || operando){
                            //erro sintatico (numero apos fechar paren ou dois numeros seguidos)
                            novo.dado="Syntax Error!";
                            topo=novo;
                            fundo=novo;
                            quebra=true;
                            pilhaP.topo=null;
                            pilhaP.fundo=null;
                            pilhaO.topo=null;
                            pilhaO.fundo=null;
                            break;
                        } else {
                            this.push(novo);
                            operando=true;
                            operador=false;
                        }
                    } else {
                        this.push(novo);
                        operando=true;
                        operador=false;
                    }
                }
            } else {
                //operadores
                if (operador||topo==null){
                    //erro sintatico (dois operadores juntos)
                    novo.dado="Syntax Error!";
                    topo=novo;
                    fundo=novo;
                    quebra=true;
                    pilhaP.topo=null;
                    pilhaP.fundo=null;
                    pilhaO.topo=null;
                    pilhaO.fundo=null;
                    break;
                } else {
                    if (pilhaO.topo==null || topo.anterior.dado.equals("(" )|| novo.prioridade>pilhaO.topo.prioridade){
                        pilhaO.push(novo);
                    } else {
                        if (topo.anterior != null){
                            if (pilhaO.topo.anterior!=null){
                                while (pilhaO.topo!=null && pilhaO.topo.prioridade >= novo.prioridade && !topo.anterior.dado.equals("(")){
                                    No conca = new No(topo.anterior.dado + topo.dado + pilhaO.topo.dado);
                                    this.pop();
                                    this.pop();
                                    pilhaO.pop();
                                    this.push(conca);
                                }
                                pilhaO.push(novo);
                            } else {
                                No conca = new No(topo.anterior.dado + topo.dado + pilhaO.topo.dado);
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
                    operador=true;
                    operando=false;
                }
            }
        }
        if (!pilhaP.empty()){
            // erro sintatico (parenteses errados)
            topo.dado="Syntax Error!";
            fundo=topo;
            topo.anterior=null;
            quebra=true;
        } else if (topo.anterior==null && pilhaO.topo!=null){
            topo.dado = topo.dado+pilhaO.topo.dado;
            pilhaO.pop();
        } else {
            while (topo.anterior!=null){
                No conca = new No(topo.anterior.dado+topo.dado+pilhaO.topo.dado);
                this.pop();
                this.pop();
                pilhaO.pop();
                this.push(conca);
            }
            if (pilhaO.topo!=null){
                topo.dado = topo.dado+pilhaO.topo.dado;
                pilhaO.pop();
            }
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

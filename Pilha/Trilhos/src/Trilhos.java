public class Trilhos {
    public Fila chegando;
    public Pilha estacao;
    public Fila saindo;

    public boolean gerenciar(int quant, String entrada){
        Fila chegando = new Fila(quant);
        Pilha estacao = new Pilha();
        Fila saindo = new Fila();
        String[] formatacao = entrada.split(" ");
        int[] arrayVagoes = new int[formatacao.length];
        for (int i = 0;i<arrayVagoes.length;i++){
            arrayVagoes[i] = Integer.parseInt(formatacao[i]);
        }
        for(int vagaoDesejado : arrayVagoes){
            if (estacao.topo==null){
                //procurar o vagao na pilha
                while (chegando.primeiro.dado!=vagaoDesejado){
                    estacao.push(chegando.primeiro.dado);
                    chegando.pop();
                }
                saindo.push(chegando.primeiro.dado);
                chegando.pop();
            } else if(estacao.topo==estacao.fundo){
                //verificar se o topo da pilha eh o numero desejado
                if (estacao.topo.dado==vagaoDesejado){
                    saindo.push(estacao.topo.dado);
                    estacao.pop();
                } else {
                    while (chegando.primeiro.dado!=vagaoDesejado){
                        estacao.push(chegando.primeiro.dado);
                        chegando.pop();
                    }
                    saindo.push(chegando.primeiro.dado);
                    chegando.pop();
                }
            } else {
                //verificar se o num desejado esta "escondido" na pilha
                if (estacao.topo.dado==vagaoDesejado){
                    saindo.push(estacao.topo.dado);
                    estacao.pop();
                } else {
                    No aux = estacao.topo.prox;
                    while (aux!=null){
                        if (aux.dado==vagaoDesejado){
                            return false;
                        } else {
                            aux = aux.prox;
                        }
                    }
                    while (chegando.primeiro.dado!=vagaoDesejado){
                        estacao.push(chegando.primeiro.dado);
                        chegando.pop();
                    }
                    saindo.push(chegando.primeiro.dado);
                    chegando.pop();
                }
            }
        }
        return true;
    }
}

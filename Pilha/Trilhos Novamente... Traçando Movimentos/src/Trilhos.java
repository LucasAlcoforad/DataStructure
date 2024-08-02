import java.util.IllegalFormatCodePointException;

public class Trilhos {
    public Fila chegando;
    public Pilha estacao;
    public Fila saindo;
    public String comandos;

    public boolean gerenciar(int quantLetras,String estadoChegada, String estadoSaida){
        comandos = "";
        chegando = new Fila(estadoChegada);
        saindo = new Fila(estadoSaida);
        estacao = new Pilha();
        for (int i=0;i<quantLetras;i++) {
            if (estacao.topo==null){
                while(!chegando.primeiro.dado.equals(saindo.primeiro.dado)){
                    estacao.push(chegando.primeiro.dado);
                    chegando.pop();
                    comandos = comandos + "I";
                }
                chegando.pop();
                saindo.pop();
                comandos = comandos + "IR";
            } else {
                if (estacao.topo.dado.equals(saindo.primeiro.dado)){
                    estacao.pop();
                    saindo.pop();
                    comandos = comandos + "R";
                } else {
                    No aux = chegando.primeiro;
                    while (aux!=null){
                        if (!aux.dado.equals(saindo.primeiro.dado)){
                            estacao.push(chegando.primeiro.dado);
                            chegando.pop();
                            comandos = comandos + "I";
                            aux = aux.prox;
                        } else {
                            chegando.pop();
                            saindo.pop();
                            comandos = comandos + "IR";
                            break;
                        }
                    }
                    if (aux==null){
                        comandos = comandos + " Impossible";
                        return false;
                    }
                    /*while(!chegando.primeiro.dado.equals(saindo.primeiro.dado)){
                        estacao.push(chegando.primeiro.dado);
                        chegando.pop();
                        comandos = comandos + "I";
                        if (chegando.primeiro.prox==null && !chegando.primeiro.dado.equals(saindo.primeiro.dado)){
                            comandos = comandos + "I Impossible";
                            return false;
                        }
                    }
                    chegando.pop();
                    saindo.pop();
                    comandos = comandos + "IR";*/
                }
            }
        }
        return true;
    }
}

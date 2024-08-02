public class Baralho {
    public Fila baralho;
    public Fila cartasDescartadas;

    public String jogar(int num){
        String cartaRestante;
        baralho = new Fila(num);
        cartasDescartadas = new Fila();
        while (baralho.primeiro!=baralho.ultimo){
            cartasDescartadas.add(baralho.primeiro.dado);
            baralho.pop();
            baralho.add(baralho.primeiro.dado);
            baralho.pop();
        }
        No aux = cartasDescartadas.primeiro;
        String cartas = "Discarded cards: ";
        while (aux!=null){
            if (aux.prox!=null){
                cartas = cartas + aux.dado + ", ";
                aux = aux.prox;
            } else {
                cartas = cartas + aux.dado;
                aux = aux.prox;
            }
        }
        return cartas;
    }
}

public class Fila {
    public No primeiro;
    public No ultimo;

    public Fila(int[] nums) {
        for (int num : nums){
            this.add(num);
        }
    }

    public void add(int dado){
        No novo = new No(dado);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        }else if(novo.dado> primeiro.dado){
            novo.prox = primeiro;
            primeiro = novo;
        }else if(novo.dado< ultimo.dado){
            ultimo.prox = novo;
            ultimo = novo;
        } else {
            No anterior = null;
            No atual = primeiro;
            while (atual!=null && novo.dado < atual.dado){
                anterior = atual;
                atual = atual.prox;
            }
            anterior.prox=novo;
            novo.prox=atual;
        }
    }

    public String show(){
        No aux = this.primeiro;
        String i = "[ ";
        while(aux!=null){
            i += aux.dado + " ";
            aux = aux.prox;
        }
        i += "]";
        return i;
    }
}

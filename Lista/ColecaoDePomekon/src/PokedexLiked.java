public class PokedexLiked {
    public No primeiro;
    public No ultimo;
    public void add(String p){
        No novo = new No(p);
        if(primeiro==null){
            primeiro=novo;
            ultimo=novo;
            novo.proximo=ultimo;
            novo.anterior=primeiro;
        } else {
            No aux = primeiro;
            while(aux.proximo!=primeiro){
                if (aux.pokemon==novo.pokemon){
                    return;
                } else {
                    aux=aux.proximo;
                }
            }
            novo.anterior=aux;
            aux.proximo=novo;
            novo.proximo=primeiro;
            ultimo=novo;
        }
    }
}

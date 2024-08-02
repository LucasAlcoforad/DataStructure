public class Lista {
    public No primeiro;
    public No ultimo;

    public void add(String lista){
        String[] compras = lista.split(" ");
        for(int i=0;i< compras.length;i++){
            if(primeiro==null){
                No novo = new No(compras[i]);
                primeiro = novo;
            } else if (ultimo==null) {
                No novo = new No(compras[i]);
                if(primeiro.nome.compareTo(novo.nome)<0){
                    ultimo = novo;
                    primeiro.proximo = novo;
                    primeiro.anterior = novo;
                    novo.anterior = primeiro;
                    novo.proximo = primeiro;
                } else if (primeiro.nome.compareTo(novo.nome)>0) {
                    ultimo = primeiro;
                    primeiro = novo;
                    novo.proximo = ultimo;
                    novo.anterior = ultimo;
                    ultimo.anterior = primeiro;
                    ultimo.proximo = primeiro;
                }else{
                    break;
                }
            } else {
                No aux = primeiro;
                No novo = new No(compras[i]);
                while (aux.nome.compareTo(novo.nome)<0||aux.proximo==primeiro){
                    aux = aux.proximo;
                }
                if (aux.nome.compareTo(novo.nome)==0){
                    break;
                }
                if (aux.proximo==primeiro){
                    ultimo = novo;
                    aux.proximo = novo;
                    novo.anterior=aux;
                    novo.proximo=primeiro;
                    primeiro.anterior=novo;
                } else {
                    novo.proximo = aux.proximo;
                    novo.anterior = aux;
                    aux.proximo = novo;
                    novo.proximo.anterior=novo;
                }
            }
        }
    }
}

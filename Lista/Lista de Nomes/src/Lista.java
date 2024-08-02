public class Lista {
    public No primeiro;
    public No ultimo;;

    public Lista(String n) {
        this.add(n);
    }

    public boolean add(String n){
        No novo = new No(n);
        if (primeiro==null) {
            primeiro = novo;
            ultimo = novo;
        } else if(ultimo.nome.length()<novo.nome.length()) {
            novo.anterior = ultimo;
            novo.proximo = primeiro;
            ultimo.proximo = novo;
            primeiro.anterior = novo;
            ultimo=novo;
        } else if(primeiro.nome.length()>novo.nome.length()){
            novo.proximo=primeiro;
            novo.anterior=ultimo;
            primeiro.anterior=novo;
            ultimo.proximo=novo;
            primeiro=novo;
        } else {
            No aux = primeiro;
            while (n.length()>aux.nome.length()){
                aux=aux.proximo;
            }
            if (aux.nome.length()==n.length()){
                return false;
            }
            aux.anterior.proximo=novo;
            novo.anterior=aux.anterior;
            novo.proximo=aux;
            aux.anterior=novo;
        }
        return true;
    }
    public void show(){
        if (primeiro != null) {
            No aux = primeiro;
            StringBuilder result = new StringBuilder();
            do {
                result.append(aux.nome).append(", ");
                aux = aux.proximo;
            } while (aux != primeiro);
            if (result.length() > 0) {
                result.setLength(result.length() - 2);
            }
            System.out.println(result.toString());
        }

    }
}

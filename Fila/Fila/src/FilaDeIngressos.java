public class FilaDeIngressos {
    public Fila fila;

    public String gerenciar(String pessoas,String pessoasDesistentes){
        boolean encontrado = false;
        StringBuilder restantes = new StringBuilder();
        String [] identificadores = pessoas.split(" ");
        String [] desistentes = pessoasDesistentes.split(" ");
        Fila fila = new Fila(identificadores);
        No aux = fila.primeiro;
        while (aux!=null){
            for (String desistente : desistentes){
                if (aux.dado.equals(desistente)) {
                    encontrado = true;
                }
            }
            if (!encontrado){
                restantes.append(aux.dado).append(" ");
            }
            encontrado = false;
            aux = aux.prox;
        }
        return restantes.toString();
    }
}

public class FilaDoRecreio {
    public Fila fila;

    public int gerenciar(String entradas){
        int contador = 0;
        int j = 0;
        String[] entrada = entradas.split(" ");
        int[] nums = new int[entrada.length];
        for (int i = 0;i<entrada.length;i++){
            nums[i] = Integer.parseInt(entrada[i]);
        }
        fila = new Fila(nums);
        No aux = fila.primeiro;
        while (aux!=null){
            if (aux.dado==nums[j]){
                contador++;
            }
            aux=aux.prox;
            j++;
        }
        return contador;
    }
}

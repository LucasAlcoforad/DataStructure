class Pokedex {
    public String[] pokemons;
    public int tamanho;

    public Pokedex() {
        this.pokemons = new String[1000];
        this.tamanho = 0;
    }

    public void show() {
        for (int c = 0; c < tamanho; c++) {
            System.out.println(pokemons[c]);
        }
        System.out.println(tamanho);
    }

    public void add(String x) {
        for (int c = 0; c < tamanho; c++) {
            if (x.equals(pokemons[c])) {
                return;
            }
        }
        pokemons[tamanho] = x;
        tamanho++;
    }
}

public class ListaEstatica {
    String[] v;
    private int tamanho;

    public ListaEstatica(int n) {
        v = new String[n];
        tamanho = 0;
    }
    private void aumentaArray() {
        String[] novoVetor = new String[v.length + 1];

        for (int i = 0; i < v.length; i++) {
            novoVetor[i] = v[i];
        }

        v = novoVetor;
    }


    public void adicionarFinal(String valor) {
        if(tamanho == v.length){
            aumentaArray();
        }
        v[tamanho] = valor;
        tamanho++;
    }

    public void adicionarPosicao(String valor, int pos) {
        if (pos < v.length) {
            for (int i = tamanho; i > pos; i--)
                v[i] = v[i-1];

            v[pos] = valor;

            tamanho++;
        } else
            System.out.println("Posicao informada nao existe.");
    }

    public void adicionarInicio(String valor) {
        adicionarPosicao(valor, 0);
    }

    public void removerFinal() {
        if (tamanho == 0)
            System.out.println("Lista vazia!");
        else
            tamanho--;
    }

    public void removerPosicao(int pos) {
        if (tamanho == 0)
            System.out.println("Lista vazia!");
        else if (pos < 0 || pos >= tamanho)
            System.out.println("Posicao invalida!");
        else {
            for (int i = pos; i < tamanho-1; i++)
                v[i] = v[i+1];

            tamanho--;
        }
    }

    public void removerInicio() {
        removerPosicao(0);
    }

    //public int buscar(int valor) {
        //for (int i = 0; i < tamanho; i++)
            //if (valor == v[i])
                //return i;

        //return -1;}
    public boolean contains(String nome) {
        for (int i = 0; i < tamanho; i++)
            if (v[i].equals(nome))
                return true;

        return false;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++)
            System.out.print(v[i] + " ");

        System.out.println();
    }

    public boolean vazia() {
        if (tamanho == 0)
            return true;
        else
            return false;
    }

    public int getTamanho() {
        return tamanho;
    }
}
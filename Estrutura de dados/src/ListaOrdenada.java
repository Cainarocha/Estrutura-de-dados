public class ListaOrdenada {
    private No primeiro;
    private No ultimo;
    private int cont;

    public ListaOrdenada() {
        this.primeiro = null;
        this.ultimo = null;
        this.cont = 0;
    }

    public void add(String elemento) {
        No novo = new No(elemento);

        if(this.primeiro == null) { //Lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
        } else if(novo.dado.compareTo(ultimo.dado) >= 0) {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        } else if(novo.dado.compareTo(primeiro.dado) < 0) {
            primeiro.anterior = novo;
            novo.proximo = primeiro;
            primeiro = novo;
        } else {
            No aux = primeiro;

            while (novo.dado.compareTo(aux.dado) >= 0) {
                aux = aux.proximo;
            }
            novo.proximo = aux;
            aux.anterior.proximo = novo;
            novo.anterior = aux.anterior;
            aux.anterior = novo;
        }
        cont++;
    }

    public boolean contains(String nome) {
        No aux = primeiro;

        for (int i = 0; i < cont; i++) {
            if (aux.dado.equals(nome)) {
                return true;
            }
            aux = aux.proximo;
        }

        return false;
    }
    public int size(){
        return cont;
    }
    public void clear(){
        primeiro = null;
        ultimo = null;
        cont = 0;
    }
    public String get(int pos){
        No aux = primeiro;
        for (int i = 0; i < cont; i++) {
            if(i == pos){
                return aux.dado;
            } else
                aux = aux.proximo;
        }
        return "";
    }

    public void show() {
        No aux = primeiro;

        System.out.print("[  ");

        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }

        System.out.println("]");
    }
}
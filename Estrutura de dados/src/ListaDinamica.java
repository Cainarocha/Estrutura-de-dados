//public class ListaDinamica { // LinkedList no Java
//    private No primeiro;
//    private No ultimo;
//    private int cont;
//
//    public ListaDinamica() {
//        this.primeiro = null;
//        this.ultimo = null;
//        this.cont = 0;
//    }
//
//    public void add(int elemento) {
//        No novo = new No(elemento);
//
//        if(this.primeiro == null) { //Lista vazia
//            this.primeiro = novo;
//            this.ultimo = novo;
//        } else {
//            ultimo.proximo = novo;
//            ultimo = novo;
//        }
//    }
//
//    public void add(int posicao, int elemento) {
//        No novo = new No(elemento);
//
//        No aux = primeiro;
//
//        for (int i = 0; i < posicao-1; i++) {
//            aux = aux.proximo;
//        }
//
//        novo.proximo = aux.proximo;
//        aux.proximo = novo;
//
//        cont++;
//    }
//
//    public void show() {
//        No aux = primeiro;
//
//        System.out.print("[  ");
//
//        while (aux != null) {
//            System.out.print(aux.dado + " ");
//            aux = aux.proximo;
//        }
//
//        System.out.println("]");
//    }
//}

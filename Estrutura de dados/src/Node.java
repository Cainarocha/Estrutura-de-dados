public class Node <T> {
    T dado;
    int prioridade;
    boolean switched;
    Node<T> anterior;
    Node<T> proximo;

    public Node(T dado, int prioridade) {
        this.dado = dado;
        this.prioridade = prioridade;
        this.switched = false;
        this.anterior = null;
        this.proximo = null;
    }

    public Node(T prioridade) {
        this.dado = prioridade;
        this.prioridade = (int) prioridade;
        this.switched = false;
        this.anterior = null;
        this.proximo = null;
    }
}
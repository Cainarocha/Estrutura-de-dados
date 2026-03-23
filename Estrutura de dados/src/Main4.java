
import java.util.Scanner;

class Node1 {

    String dado;
    Node1 anterior;
    Node1 proximo;

    public Node1(String dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaOrdenada1 {

    private Node1 primeiro;
    private Node1 ultimo;
    private int cont = 0;

    public void add(String elem) {
        Node1 novo = new Node1(elem);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;

        } else if (novo.dado.compareTo(primeiro.dado) < 0) {
            primeiro.anterior = novo;
            novo.proximo = primeiro;
            primeiro = novo;

        } else if (novo.dado.compareTo(ultimo.dado) >= 0) {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;

        } else {
            Node1 aux = primeiro;

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

    public int size() {
        return cont;
    }

    public void clear() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }

    public boolean contains(Object obj) {
        Node1 aux = primeiro;

        for (int i = 0; i < cont; i++) {
            if (aux.dado.equals(obj)) {
                return true;
            }
            aux = aux.proximo;
        }

        return false;
    }

    public void remove(Object obj) {
        Node1 aux = primeiro.proximo;
        boolean found = false;

        if (primeiro == obj) {
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
            found = true;

        } else if (ultimo == obj) {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
            found = true;

        } else {
            for (int i = 1; i < cont - 1; i++) {
                if (aux.dado == obj) {
                    found = true;
                    break;
                }

                aux = aux.proximo;
            }

            aux.anterior.proximo = aux.proximo;
            aux.proximo.anterior = aux.anterior;
        }

        if (found) {
            cont--;
        }
    }

    public void remove(int pos) {
        Node1 aux = primeiro.proximo;
        boolean found = false;

        if (pos == 0) {
            primeiro = primeiro.proximo;
            found = true;

        } else if (pos == cont-1) {
            ultimo = ultimo.anterior;
            found = true;

        } else {
            for (int i = 1; i < cont - 1; i++) {
                if (i == pos) {
                    found = true;
                    break;
                }

                aux = aux.proximo;
            }

            aux.anterior.proximo = aux.proximo;
            aux.proximo.anterior = aux.anterior;
        }

        if (found) {
            cont--;
        }
    }

    public String get(int pos) {
        Node1 aux = primeiro;

        if (pos > cont-1 || pos < 0) {
            throw new IndexOutOfBoundsException("Index " + pos + " out of bounds for length " + cont);
        }

        for (int i = 0; i < cont; i++) {
            if (i == pos) {
                return aux.dado;
            } else {
                aux = aux.proximo;
            }
        }

        return "";
    }

    public int indexOf(Object obj) {
        Node1 aux = primeiro;

        for (int i = 0; i < cont; i++) {
            if (aux.dado == obj) {
                return i;
            } else {
                aux = aux.proximo;
            }
        }

        return -1;
    }

    public void show() {
        Node1 aux = primeiro;

        System.out.print("[");
        for (int i = 0; i < cont; i++) {
            if (i == cont-1) {
                System.out.printf("%s",aux.dado);
            } else {
                System.out.printf("%s, ", aux.dado);
                aux = aux.proximo;
            }
        }
        System.out.println("]");
    }
}

public class Main4 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ListaOrdenada1 lista = new ListaOrdenada1();

        int n = input.nextInt();
        input.nextLine();

        while (n > 0) {
            lista.clear();
            String[] s = input.nextLine().split(" ");

            for (int i = 0; i < s.length; i++) {
                if (!lista.contains(s[i])) {
                    lista.add(s[i]);
                }
            }

            for (int i = 0; i < lista.size(); i++) {
                if (i == lista.size() - 1) {
                    System.out.println(lista.get(i));
                } else {
                    System.out.print(lista.get(i) + " ");
                }
            }

            n--;
        }
    }
}

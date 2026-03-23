import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(0);
        Scanner scanner = new Scanner(System.in);
        int quantidade = 151;
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            if(!lista.contains(nome)){
                lista.adicionarFinal(nome);
                quantidade--;
            }
        }
        System.out.println("Falta(m) " + quantidade + " pomekon(s).");
    }
}

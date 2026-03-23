import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        FilaDinamica<Integer> fila = new FilaDinamica<Integer>();

        int num;
        while (input.hasNext()){
            String s = "";
            num = input.nextInt();
            if (num == 0){
                break;
            }
            for (int i = 1; i <= num; i++) {
                fila.enqueue(i);
            }
            while (fila.size() > 2){
                s += fila.dequeue() + ", ";
                fila.enqueue(fila.dequeue());
            }
            s += fila.dequeue();
            System.out.println("Discarded cards: " + s);
            System.out.println("Remaining card: " + fila.dequeue());
        }
    }
}
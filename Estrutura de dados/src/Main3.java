//import java.util.Scanner;
//
//public class Main3 {
//    public static void main(String[] args) {
//        ListaOrdenada lista = new ListaOrdenada();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        while (n > 0) {
//            lista.clear();
//            String[] compra = scanner.nextLine().split(" ");
//            for (int i = 0; i < compra.length; i++) {
//                if (!lista.contains(compra[i])) {
//                    lista.add(compra[i]);
//                }
//            }
//            for (int i = 0; i < lista.size(); i++) {
//                if (i == lista.size() - 1) {
//                    System.out.println(lista.get(i));
//                } else
//                    System.out.print(lista.get(i) + " ");
//            }
//            n--;
//        }
//    }
//}
//

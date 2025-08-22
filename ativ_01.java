import java.util.ArrayList;

public class ativ_01 {
    public static void main(String[] args) {
      // Inversão de Lista
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        System.out.println("Lista original: " + lista);

        ArrayList<String> listaInvertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));
        }

        System.out.println("Lista invertida: " + listaInvertida);
    }
}
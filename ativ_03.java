import java.util.ArrayList;

public class ativ_03 {
    public static void main(String[] args) {
      // Mesclar Listas
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("D");
        lista2.add("E");
        lista2.add("F");

        System.out.println("Lista 1: " + lista1);

        System.out.println("Lista 2: " + lista2);

        ArrayList<String> listaMesclada = new ArrayList<>(lista1);
        listaMesclada.addAll(lista2);

        System.out.println("Lista mesclada: " + listaMesclada);
    }
}

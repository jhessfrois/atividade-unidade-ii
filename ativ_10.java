import java.util.ArrayList;

public class ativ_10 {

    public static void main(String[] args) {
        // Implementação de Algoritmo de Ordenação
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Notebook");
        produtos.add("Mouse");
        produtos.add("Teclado");
        produtos.add("Monitor");
        produtos.add("Cadeira");
        produtos.add("Webcam");

        System.out.println("Produtos originais: " + produtos);

        bubbleSortDecrescente(produtos);

        System.out.println("Produtos ordenados (decrescente): " + produtos);
    }

    // Bubble Sort decrescente para Strings
    public static void bubbleSortDecrescente(ArrayList<String> lista) {
        int n = lista.size();
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // Para ordem decrescente, se o elemento atual < próximo, troca
                if (lista.get(j).compareTo(lista.get(j + 1)) < 0) {
                    // troca manual
                    String temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                    trocou = true;
                }
            }
            // Se não houve troca, a lista já está ordenada
            if (!trocou) {
                break;
            }
        }
    }
}

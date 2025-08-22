import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ativ_05 {
    public static void main(String[] args) {
        // Inversão com Pilha
        List<String> produtos = new ArrayList<>();
        produtos.add("Notebook");
        produtos.add("Mouse");
        produtos.add("Teclado");
        produtos.add("Monitor");

        System.out.println("Original: " + produtos);
        List<String> invertida = inverterLista(produtos);
        System.out.println("Invertida: " + invertida);
    }

    public static List<String> inverterLista(List<String> produtos) {
        Stack<String> pilha = new Stack<>();

        for (String produto : produtos) {
            pilha.push(produto);
        }

        List<String> invertida = new ArrayList<>();
        while (!pilha.isEmpty()) {
            invertida.add(pilha.pop());
        }

        return invertida;
    }
}
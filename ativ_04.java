import java.util.Stack;

public class ativ_04 {
    public static void main(String[] args) {
        // Verificação de Expressões
        String expressao1 = "(a + b) * (c - d)";
        String expressao2 = "((a + b) * (c - d)";
        String expressao3 = ")(a + b)(";
        String expressao4 = "a + b - c * d";

        System.out.println(verificarParenteses(expressao1)); // true
        System.out.println(verificarParenteses(expressao2)); // false
        System.out.println(verificarParenteses(expressao3)); // false
        System.out.println(verificarParenteses(expressao4)); // true
    }

    public static boolean verificarParenteses(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c); // abre parêntese, empilha
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false; // fecha parêntese sem abrir
                }
                pilha.pop(); // remove o parêntese correspondente
            }
        }

        return pilha.isEmpty(); // se a pilha estiver vazia, está balanceado
    }
}
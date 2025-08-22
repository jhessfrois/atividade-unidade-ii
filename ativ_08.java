import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ativ_08 {
  public static void main(String[] args) {
    // Contagem de Palavras
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma frase para análise:");
    String frase = scanner.nextLine();

    // Remove pontuação e converte para minúsculas
    frase = frase.replaceAll("[^a-zA-Zà-úÀ-Ú0-9 ]", "").toLowerCase();

    String[] palavras = frase.split("\\s+");
    HashMap<String, Integer> frequencia = new HashMap<>();

    for (String palavra : palavras) {
      if (palavra.isEmpty()) continue;
      frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
    }

    System.out.println("Frequência das palavras:");
    for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    scanner.close();
  }
}
import java.util.HashMap;
import java.util.Map;

public class ativ_09 {
  public static void main(String[] args) {
    // Mesclar Mapas
    Map<String, String> produtosA = new HashMap<>();
    produtosA.put("P001", "Teclado");
    produtosA.put("P002", "Mouse");
    produtosA.put("P003", "Monitor");

    Map<String, String> produtosB = new HashMap<>();
    produtosB.put("P002", "Mouse Óptico");
    produtosB.put("P003", "Monitor LED");
    produtosB.put("P004", "Impressora");

    Map<String, String> produtosMesclados = mesclarMapas(produtosA, produtosB);

    for (Map.Entry<String, String> entry : produtosMesclados.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

  public static Map<String, String> mesclarMapas(Map<String, String> map1, Map<String, String> map2) {
    Map<String, String> resultado = new HashMap<>(map1);

    for (Map.Entry<String, String> entry : map2.entrySet()) {
      String chave = entry.getKey();
      String valor = entry.getValue();

      if (resultado.containsKey(chave)) {
        // Conflito: concatena os valores
        resultado.put(chave, resultado.get(chave) + ", " + valor);
      } else {
        resultado.put(chave, valor);
      }
    }
    return resultado;
  }
}
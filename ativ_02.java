import java.util.ArrayList;

public class ativ_02 {
    public static void main(String[] args) {
      // Remoção de Elementos Duplicados
        ArrayList<String> cadastro = new ArrayList<>();
        cadastro.add("João");
        cadastro.add("Maria");
        cadastro.add("João");
        cadastro.add("Ana");
        cadastro.add("Maria");

        System.out.println("Cadastro original: " + cadastro);

        ArrayList<String> cadastroSemDuplicados = new ArrayList<>();

        for (String pessoa : cadastro) {
            if (!cadastroSemDuplicados.contains(pessoa)) {
                cadastroSemDuplicados.add(pessoa);
            }
        }

        System.out.println("Cadastro sem duplicados: " + cadastroSemDuplicados);

    }
}

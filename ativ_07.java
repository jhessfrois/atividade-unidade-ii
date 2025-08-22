import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ativ_07 {
  public static void main(String[] args) {
    // Ordem de Chegada
    Scanner scanner = new Scanner(System.in);
    Queue<String> filaClientes = new LinkedList<>();

    System.out.print("Quantos clientes vão entrar na loja? ");
    int quantidade = scanner.nextInt();
    scanner.nextLine(); // Limpa o buffer

    for (int i = 1; i <= quantidade; i++) {
      System.out.print("Nome do cliente " + i + ": ");
      String nome = scanner.nextLine();
      filaClientes.add(nome);
    }

    System.out.println("\nOrdem de saída (atendimento):");
    while (!filaClientes.isEmpty()) {
      String clienteAtendido = filaClientes.poll();
      System.out.println(clienteAtendido);
    }

    scanner.close();
  }
}
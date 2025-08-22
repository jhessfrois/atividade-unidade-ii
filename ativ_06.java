import java.util.LinkedList;
import java.util.Queue;

public class ativ_06 {

    public static void main(String[] args) {
      // Implementação de um Sistema de Fila de Espera
        Queue<String> fila = new LinkedList<>();

        // Adicionando pacientes
        adicionarPaciente(fila, "João");
        adicionarPaciente(fila, "Maria");
        adicionarPaciente(fila, "Carlos");

        // Exibindo a fila
        System.out.println("Fila atual: " + fila);

        // Chamando pacientes
        chamarPaciente(fila);
        chamarPaciente(fila);

        // Exibindo a fila após atendimento
        System.out.println("Fila após atendimento: " + fila);
    }

    public static void adicionarPaciente(Queue<String> fila, String paciente) {
        fila.add(paciente);
        System.out.println(paciente + " entrou na fila.");
    }

    public static void chamarPaciente(Queue<String> fila) {
        if (!fila.isEmpty()) {
            String paciente = fila.poll();
            System.out.println(paciente + " foi atendido.");
        } else {
            System.out.println("Nenhum paciente na fila.");
        }
    }
}
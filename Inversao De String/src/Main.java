import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String entrada = scanner.nextLine(); // Recebe a string

        String stringInvertida = inverterString(entrada); // Chama o método responsável por inverter a string
        System.out.println("String invertida: " + stringInvertida); // Imprime a string invertida

        scanner.close();
    }

    private static String inverterString(String entrada) {
        StringBuilder stringBuilder = new StringBuilder(entrada); // Optei por utilizar StringBuilder por já ter um método para inverter a string
        return stringBuilder.reverse().toString(); // Inverte a string e retorna
    }
}

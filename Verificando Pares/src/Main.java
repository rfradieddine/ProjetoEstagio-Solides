import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> obterNumerosPares(List<Integer> numeros) {
        List<Integer> numerosPares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }
        return numerosPares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Digite a quantidade de números: ");
        int quantidadeNumeros = scanner.nextInt();

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        List<Integer> numerosPares = obterNumerosPares(numeros);

        System.out.println("Números pares digitados: " + numerosPares);

        scanner.close();
    }
}

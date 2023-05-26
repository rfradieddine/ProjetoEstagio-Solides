import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> obterNumerosPares(List<Integer> numeros) {
        List<Integer> numerosPares = new ArrayList<>();

        for (int numero : numeros) { // Para cada número na lista de números
            if (numero % 2 == 0) { // Se o número for par
                numerosPares.add(numero); // Adiciona o número na lista de números pares
            }
        }
        return numerosPares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>(); // Lista de números

        System.out.print("Digite a quantidade de números: ");
        int quantidadeNumeros = sc.nextInt(); // Quantidade de números

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidadeNumeros; i++) { // Para cada número
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        List<Integer> numerosPares = obterNumerosPares(numeros); // Lista de números pares

        System.out.println("Números pares digitados: " + numerosPares);

        sc.close();
    }
}

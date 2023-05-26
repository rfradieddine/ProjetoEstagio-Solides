import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>(); // cria um ArrayList de números reais

        System.out.println("Digite a quantidade de números: ");
        int quantidadeNumeros = sc.nextInt(); // lê a quantidade de números

        System.out.println("Digite os números: ");
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = sc.nextInt();
            numeros.add((double) numero);
        }

        double media = calcularMediaAritmetica(numeros); // chama o método calcularMediaAritmetica e armazena o retorno na variável media
        System.out.println("A média aritmética é: " + media); // imprime a média aritmética

        sc.close(); // fecha o scanner
    }

    public static double calcularMediaAritmetica(List<Double> numeros) {
        double soma = 0; // declara uma variável real chamada soma e atribui o valor 0

        for (double numero : numeros) { // para cada número no ArrayList
            soma += numero; // soma o número à variável soma
        }

        return soma / numeros.size(); // retorna a soma dividida pelo tamanho do ArrayList
    }
}

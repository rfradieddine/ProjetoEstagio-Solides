import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine(); // lê a palavra digitada pelo usuário
        scanner.close();

        if (verificarPalindromo(palavra)) { // chama o método verificarPalindromo e verifica se o retorno é verdadeiro
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }

    public static boolean verificarPalindromo(String palavra) { // método que verifica se uma palavra é um palíndromo
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        int comprimento = palavra.length(); // armazena o comprimento da palavra em uma variável
        for (int i = 0; i < comprimento / 2; i++) { // percorre metade da palavra
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) { // verifica se o caractere atual é diferente do caractere correspondente
                return false; // retorna falso se os caracteres forem diferentes
            }
        }
        return true; // retorna verdadeiro se os caracteres forem iguais
    }
}

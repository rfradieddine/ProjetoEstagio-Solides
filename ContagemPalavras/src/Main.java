import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:"); // imprime a mensagem
        String frase = scanner.nextLine(); // lê a frase digitada pelo usuário

        int contadorPalavras = contarPalavras(frase); // chama o método contarPalavras e armazena o retorno na variável contadorPalavras
        System.out.println("Número de palavras: " + contadorPalavras); // imprime o número de palavras

        scanner.close(); // fecha o scanner
    }

    private static int contarPalavras(String frase) {
        if (frase == null || frase.isEmpty()) { // verifica se a frase é nula ou vazia
            return 0; // retorna 0 se a frase for nula ou vazia
        }

        String[] palavras = frase.split("\\s+"); // \\s+ é uma expressão regular que significa "um ou mais espaços"
        return palavras.length; // retorna o tamanho do array
    }
}

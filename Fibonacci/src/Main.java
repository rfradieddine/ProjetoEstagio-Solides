public class Main {
    public static void main(String[] args) {
        int n = 11; // número de elementos da sequência de Fibonacci
        int[] fibonacci = new int[n]; // cria um array de inteiros com n elementos
        fibonacci[0] = 0; // atribui 0 ao primeiro elemento do array
        fibonacci[1] = 1; // atribui 1 ao segundo elemento do array

        for (int i = 2; i < n; i++) { // i começa em 2 porque os dois primeiros elementos já foram atribuídos
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // atribui a soma dos dois elementos anteriores ao elemento atual
        }

        for (int i = 0; i < n; i++) { // percorre o array
            System.out.printf("fibonacci[%d] = %d\n", i, fibonacci[i]); // imprime o índice e o valor do elemento atual
        }
    }
}
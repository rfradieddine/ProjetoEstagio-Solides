public class Main {
    public static void main(String[] args) {
        int numeroElementos = 10; // número de elementos da sequência de Fibonacci
        int[] numerosFibonacci = new int[numeroElementos]; // cria um array de inteiros com 10 elementos
        numerosFibonacci[0] = 0; // atribui 0 ao primeiro elemento do array
        numerosFibonacci[1] = 1; // atribui 1 ao segundo elemento do array

        for (int i = 2; i < numeroElementos; i++) { // i começa em 2 porque os dois primeiros elementos já foram atribuídos
            numerosFibonacci[i] = numerosFibonacci[i - 1] + numerosFibonacci[i - 2]; // atribui a soma dos dois elementos anteriores ao elemento atual
        }

        for (int i = 0; i < numeroElementos; i++) { // percorre o array
            System.out.printf("fibonacci[%d] = %d\n", i, numerosFibonacci[i]); // imprime o índice e o valor do elemento atual
        }
    }
}
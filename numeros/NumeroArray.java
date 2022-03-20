package supera.numeros;

import java.util.Scanner;

public class NumeroArray {

    static int numerosPares(int arr[], int n, int k) {
        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (arr[i] - arr[j] == k ||
                        arr[j] - arr[i] == k)
                    contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero de referencia");
        int num = entrada.nextInt();
        System.out.println("Qual o tamanho do vetor?");
        int vetor = entrada.nextInt();

        int[] sequencia = new int[vetor];

        System.out.println("Digite os numeros, inteiros e positivos.");

        for (int i = 0; i < vetor; i++) {
            sequencia[i] = entrada.nextInt();
        }



        System.out.println("Total de pares " + numerosPares(sequencia, vetor, num));

    }
}

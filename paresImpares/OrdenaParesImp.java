package supera.paresImpares;

import java.util.*;

public class OrdenaParesImp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o total de numeros");
        int totNum = entrada.nextInt();

        int[] sequencia = new int[totNum];

        System.out.println("Digite os numeros, inteiros e positivos.");

        for (int i = 0; i < totNum; i++) {
            sequencia[i] = entrada.nextInt();
        }
        System.out.println(Arrays.toString(sequencia));

        int m = 0, n = 0;
        for (int i = 0; i < totNum; i++) {
            if (sequencia[i] % 2 == 0) {
                m++;
            } else {
                n++;
            }
        }

        int[] par = new int[m];
        int[] impar = new int[n];

        int j = 0, k = 0;

        for (int i = 0; i <totNum; i++) {
            if (sequencia[i] % 2 == 0) {
                par[j] = sequencia[i];
                j++;
            } else {
                impar[k] = sequencia[i];
                k++;
            }
        }

        for (int i = 0; i < par.length; i++) {
            for (int p = i+1; p < par.length; p++) {
                if(par[i] > par[p]) {
                    int tempPar = par[i];
                    par[i] = par[p];
                    par[p] = tempPar;
                }
            }
        }

        for (int i = 0; i < impar.length; i++) {
            for (int q = i+1; q < impar.length; q++) {
                if(impar[i] < impar[q]) {
                    int tempImp = impar[i];
                    impar[i] = impar[q];
                    impar[q] = tempImp;
                }
            }
        }

        for (int i = 0; i < par.length; i++) {
            System.out.println(par[i] + " ");
        }

        for (int i = 0; i < impar.length; i++) {
            System.out.println(impar[i] + " ");
        }

    }
}

package supera.dinheiro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class numeroNotas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor;

        System.out.printf("Informe o Valor das notas: ");
        valor = entrada.nextDouble();

        System.out.printf("%s", calcularNotas(valor));

    }

    public static String calcularNotas(double valor) {
        DecimalFormat formatador = new DecimalFormat("###,##0.00");

        int nota[] = {100, 50, 20, 10, 5, 2, 1};
        int centavos[] = {50, 25, 10, 5, 1};

        String result;
        int i, vlr, ct;

        result = "\nNotas = R$" + formatador.format(valor) + "\n\n";


        vlr = (int) valor;
        i = 0;
        while (vlr != 0) {
            ct = vlr / nota[i];
            if (ct != 0) {
                result = result + (ct + " nota(s) de R$ " + nota[i] + "\n");
                vlr = vlr % nota[i];
            }
            i = i + 1;
        }

        result = result + "\n";


        vlr = (int) Math.round((valor - (int) valor) * 100);
        i = 0;
        while (vlr != 0) {
            ct = vlr / centavos[i];
            if (ct != 0) {
                result = result + (ct + " moeda(s) de " + centavos[i] +
                        " centavo(s)\n");
                vlr = vlr % centavos[i];
            }
            i = i + 1;
        }
        return (result);

    }

}

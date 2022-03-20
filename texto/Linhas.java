package supera.texto;

public class Linhas {
    public static String txtA = "THIS LINE IS GIBBERISH";
    public static String txtB = "LEVELKAYAK";
    public static String txtC = "HAPPY HOLIDAYS";
    public static String txtD = "MLKJIHGFEDCBAZYXWVUTSRQPON";
    public static String txtE = "FRENCH HENS TWO DOVES AND A PARTRIDGE";

    public static void main(String[] args) {

        divideLinha(txtA);

    }

    public static void divideLinha (String txt) {
        int tam = txt.length() / 2;
        String ini = txt.substring(0, tam);
        String iniInv = new StringBuffer(ini).reverse().toString();

        String fim = txt.substring(tam);
        String fimInv = new StringBuffer(fim).reverse().toString();

        System.out.println(iniInv + fimInv);


    }
}

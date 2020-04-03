public class Addition {

    public static int calcul(final int int1, final int int2) {
        final int somme = int1 + int2;
        return somme;
    }

    public static void main(String[] args) {
        int var = calcul(5, 8);
        System.out.println(var);
    }

}
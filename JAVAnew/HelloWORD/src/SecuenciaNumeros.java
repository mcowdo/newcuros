public class SecuenciaNumeros {
    public static void main(String[] args) {
        System.out.println("Numero\tCuadrado\tCubo");

        for (int i = 0; i <= 10; i++) {
            int numero = i;
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.printf("%d\t\t%d\t\t\t%d%n", numero, cuadrado, cubo);
        }
    }
}
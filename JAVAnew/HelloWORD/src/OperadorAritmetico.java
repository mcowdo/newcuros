import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println(" resta = " + resta);
        System.out.println("(i - j)= " + (i - j));

        int mult = i * j;
        System.out.println("multiplicacion = " + mult);

        int div = i / j;
        float div2 = (float) i / (float) j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("Numero par = " + numero);
        } else {
            System.out.println("Numero impar = " + numero);
        }
    }
}

import java.util.Scanner;

public class PracticaEscanner {
    public static void main(String[] args) {

        Scanner escanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre por favor");
        String nombre = escanner.nextLine();
        double salario = 85.63;
        System.out.println("Ingresa tu suledo tus dias trabajados");
        int dias = escanner.nextInt();

        escanner.close();

        var total = salario *dias ;

        System.out.println("Nombre: " + nombre);
        System.out.println("Dias trabajados: " + dias);
        System.out.println("Total del salario: " + total);







    }
}

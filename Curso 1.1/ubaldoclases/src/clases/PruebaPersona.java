package clases;

import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        persona persona1 = new persona();

        System.out.println("Ingresa el nombre: ");
        persona1.nombre = s.nextLine();
        System.out.println("Ingresa el apellido: ");
        persona1.apellido = s.nextLine();
        persona1.desplegarInformacion();

        persona persona2 = new persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        persona2.desplegarInformacion();
        persona2.nombre = "karla";
        persona2.apellido ="brugada";
        persona2.desplegarInformacion();
    }
}

import java.util.Scanner;

public class primitivosPar1 {
    public static void main(String[] args) {

        var edad = Integer.parseInt("20");

        System.out.println("(edad) = " + (edad+1));

        var ValorDePi = Double.parseDouble("3.1416");
        System.out.println("ValorDePi = " + ValorDePi);

        /*var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        */
       var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "HOLa".charAt(0);
        System.out.println("caracter = " + caracter);


    }
}

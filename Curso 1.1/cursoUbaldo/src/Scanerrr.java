import java.util.Scanner;

public class Scanerrr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombre = s.nextLine();
        System.out.println("Escribe el titulo");
        String titulo =s.nextLine();
        System.out.println("Resultado: " + titulo + " " + nombre);


        
    }
}

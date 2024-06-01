import java.util.Scanner;

public class rectanguloTarea
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el alto del rectangulo");
        int  alto = s.nextInt();
        System.out.println("Ingrese lo ancho del rectangulo");
        int  ancho = s.nextInt();

        int area = alto * ancho;
        int perimetro = (alto + ancho)*2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}

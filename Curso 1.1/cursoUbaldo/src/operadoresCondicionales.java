import java.util.Scanner;

public class operadoresCondicionales {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 10;
        int valorMinimo = 0;
        int valorMaximo = 10;

        var resultado = valorMinimo >= 0 && valorMaximo<=10;
        if(resultado)
        {
            System.out.println("dentro de rango ");
        }
        else
        {
            System.out.println("fuera de rango");
        }

        boolean vacacioes = true;
        boolean diaDescanso = false;

        if(vacacioes || diaDescanso)
        {
            System.out.println("Padre puede asistir al juego");
        }
        else
        {
            System.out.println("el padre esta ocupado");
        }
    }
}

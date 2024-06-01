import java.util.Scanner;

public class mayordedosnumeros
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int numero1 = s.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int numero2 = s.nextInt();
        System.out.println("El numero mayor es: ");
        System.out.println(numero1>numero2 ? numero1 :numero2);
    }
}

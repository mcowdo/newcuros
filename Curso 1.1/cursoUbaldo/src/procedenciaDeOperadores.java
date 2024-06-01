import java.util.Scanner;

public class procedenciaDeOperadores
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = 5;
        int y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4+5*6/3;
        System.out.println("resultado = " + resultado);

    }
}

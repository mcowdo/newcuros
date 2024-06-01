import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digita tu promedio");
        float promedio = s.nextFloat();

        if(promedio >= 10)
        {
            System.out.println("Excelente promedio");
        } else if (promedio>=6.0) 
        {
            System.out.println("Muy buen promedio");    
        } else if (promedio >= 5.0) {
            System.out.println("regular");
            
        } else {
            System.out.println("reprobado");

        }

    }
}

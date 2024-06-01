import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a =3, b = 2;
        var resultado = a + b;
        double div;
        System.out.println("resultado = " + resultado);

        resultado = a - b;
        System.out.println("resultado = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado = " + resultado);
        
       /*resultado = a / b;
        System.out.println("resultado = " + resultado);
        */
        resultado = a % b;
        System.out.println("Resultado " + resultado);

        if(b % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}

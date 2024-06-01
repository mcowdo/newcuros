package operaciones;

import java.util.Scanner;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //VARIABLES LOCALES
        int a = 10;
        var b = 2;
        miMetodo();


        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica a: " + aritmetica1.a);
        System.out.println("aritmetica b: " + aritmetica1.b);


        /*Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2.a = " + aritmetica2.a);
        System.out.println("aritmetica2.b = " + aritmetica2.b);

        System.out.println("Ingresa eel primer valor de la suma: ");
        aritmetica1.a = s.nextInt();
        System.out.println("ingresa el segundo numero de la suma: ");
        aritmetica1.b = s.nextInt();
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);



        resultado= aritmetica1.sumarConArgumentos(8,7);
        System.out.println("resultado argumentos = " + resultado);*/

    }
    public static void miMetodo(){
        //a = 10;
        System.out.println("Mi metodo");

    }
}

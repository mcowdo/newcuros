import java.util.Scanner;

public class primitivosJava {
    public static void main(String[] args) {

        //ok que nose que andas haciendo pero esta bien
        Scanner nuevoss= new Scanner(System.in);

        byte numeroByte = 10;

        System.out.println("numero minimo de byte: " +Byte.MAX_VALUE);
        System.out.println("Numero maximo de byte: " + Byte.MIN_VALUE+"\n");

        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numero maximo Short: " +Short.MAX_VALUE);
        System.out.println("Numero maximo Short: " +Short.MIN_VALUE+"\n");

        int numero = 10;
        System.out.println("numero = " + numero);
        System.out.println("int numero maximo: " + Integer.MAX_VALUE);
        System.out.println("Int numero minimo: " + Integer.MIN_VALUE +"\n");

        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Numero long maximo: " + Long.MAX_VALUE);
        System.out.println("Numero long minimo: " + Long.MIN_VALUE+"\n");

        float numeroFloat = 10.354564f;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numero maximo float: " + Float.MAX_VALUE);
        System.out.println("numero minimo float: " + Float.MIN_VALUE+"\n");

        double numeroDouble = 10.35;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("numero maximo de double: "+Double.MAX_VALUE);
        System.out.println("Numero minimo de double: "+Double.MIN_VALUE+"\n");


    }
}

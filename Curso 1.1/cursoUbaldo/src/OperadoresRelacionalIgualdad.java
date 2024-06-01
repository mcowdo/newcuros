public class OperadoresRelacionalIgualdad {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        boolean c = (a==b);
        System.out.println("c = " + c);
        var d = (a !=b);
        System.out.println("d = " + d);

        String cadena1 ="hola";
        String cadena2 = "hola";
        boolean e = cadena1 == cadena2;
        System.out.println("e = " + e);
        
        boolean f = cadena1.equals(cadena2);
        System.out.println("f = " + f);

        boolean g = a >= b;
        System.out.println("g = " + g);

        if(a%2 == 0)
        {
            System.out.println("numero par");
        }
        else
        {
            System.out.println("numero impar");
        }

        int edad = 10;
        int adulto = 18;
        if(edad>=adulto)
        {
            System.out.println("Es un adulto");
        }
        else
        {
            System.out.println("Es menor de edad");
        }
    }
}

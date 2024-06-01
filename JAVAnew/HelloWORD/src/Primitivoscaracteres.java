public class Primitivoscaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println( decimal == caracter);
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("Char corresponde a bites = " + Character.SIZE);
        System.out.println("Character.MIN_Value = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_Value = " + Character.MAX_VALUE) ;
    }
}

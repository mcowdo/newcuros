public class Primitovos_flotante {
    public static void main(String[] args) {

        float realFlat = 2.12e4f; //2120f;
        System.out.println("realFlat = " + realFlat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde a bites a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minomo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double  corresponde a bites a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}

public class EjemplosStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println( arreglo[i]);
        }
        System.out.println(" trabalenguas = " +trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for (int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";

        String[] archivoarr = archivo.split("\\.");
        l = archivoarr.length;
        for (int j=0; j<l; j++){
            System.out.println(archivoarr[j]);
        }
        System.out.println("extencion = " + archivoarr[l-1]);


    }
}


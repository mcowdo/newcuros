import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mes = 5;
        String estacion ="estacion desconocida";
        switch (mes){
            case 1: case 2: case 12:
                estacion = "invierno";
                break;
            case 3: case 4: case 5:
                estacion = "primavera ";
                break;
            case 6: case 7: case 8:
                estacion = "verano";
                break;
            case 9: case 10: case 11:
                estacion = "atoño";
                break;

        }
        System.out.println("estacion = " + estacion);
    }
}

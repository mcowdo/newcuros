import java.util.Scanner;

public class Operador_ternario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("matematicas: ");
        matematicas = s.nextDouble();
        System.out.println("ciencias: ");
        ciencias = s.nextDouble();
        System.out.println("historia: ");
        historia = s.nextDouble();


        promedio = (matematicas + ciencias + historia) /3;

        System.out.println("promedio " + promedio);

        estado = promedio >= 5.49 ? "aprobado" : "rechazado";
        System.out.println("estado = " + estado);
    }
}

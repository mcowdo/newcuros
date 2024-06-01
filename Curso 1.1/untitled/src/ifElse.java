import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        double promedio;
        System.out.println("Digita tu promedio");
        promedio = lectura.nextDouble();

        if(promedio >= 6.5){
            System.out.println("felicitaciones pasaste el curso");

        }else if(promedio >= 6.0){
            System.out.println("Mul buen promedio");
        }else if (promedio >= 5.0){
            System.out.println("regular necesitas esforzarte mas");
        }else{
            System.out.println("ok ponte a atarabajar");
        }
    }
}

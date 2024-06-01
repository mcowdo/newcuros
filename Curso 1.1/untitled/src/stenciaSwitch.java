import java.util.Scanner;
public class stenciaSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  num;
        System.out.print("digite un numero: ");
        num = s.nextInt();


        switch(num){
            case 0:
                System.out.println("el numero es cero");
                break;
            case 1:
                System.out.println("el caso es uno");
                break;
            case 2:
                System.out.println("el caso es dos");
                break;
            case 3:
                System.out.println("el caso es tres");
                break;
            default:
                System.out.println("No se encontró numero ");
        }
    }
}

import java.util.Scanner;

public class elseif2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Proporciona el numero de mes: ");
        int mes = s.nextInt();
        if (mes==1||mes==2||mes==12){
            System.out.println("Inverno");
        } else if (mes==3||mes==4||mes==5) {
            System.out.println("Primavera");
         } else if (mes ==6||mes ==7||mes==8) {
            System.out.println("verano");
        } else if (mes==9||mes==10||mes==11) {
            System.out.println("otoño");
        }
    }
}

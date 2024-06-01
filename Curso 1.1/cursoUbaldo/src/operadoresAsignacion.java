import java.util.Scanner;

public class operadoresAsignacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = 3, b = 2;
        int c = a + 5 -b;

        System.out.println("c = " + c);

        a +=1;
        System.out.println("a = " + a);
        
        a +=3;
        System.out.println("a = " + a);
    }
}

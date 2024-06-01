import java.util.Scanner;

public class ciclofor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        inicio:
        for(int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                continue inicio;


            }
            System.out.println("i = " + i);
        }
    }
}

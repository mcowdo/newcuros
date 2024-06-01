import java.util.Scanner;

public class ciclodowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contador = 0;
        do{
            System.out.println("contador = "+contador);
            contador++;
        }while(contador < 20);
    }
}

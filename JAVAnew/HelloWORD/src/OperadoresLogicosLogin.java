import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames [0] = "andres";
        passwords [0] = "12345";

        usernames [1] = "admin";
        passwords [1] = "12345";

        usernames [2] = "pepe";
        passwords [2] = "12345";*/

        String [] usernames = {"andres", "admin","pepe"};
        String [] passwords = {"12345","12345","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingresa el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++)
        {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
           /* if ( usernames[i].equals(u) && passwords[i].equals(p))  {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bievenido usuario ".concat(u).concat("!") :
                "Username o contraeña incorrecos\n lo siento requiere autentificacion";

        System.out.println("mensaje = " + mensaje);
       /* if (esAutenticado) {

            System.out.println("Bievenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("Username o contraeña incorrecos");
            System.out.println("los siento requiere autentificacion");
        }*/

    }
}

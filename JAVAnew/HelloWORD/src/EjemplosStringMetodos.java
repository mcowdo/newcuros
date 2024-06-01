import java.util.Locale;

public class EjemplosStringMetodos {
    public static void main(String[] args) {


        String nombre = "Oswaldo";
        System.out.println("Nombre.lenght() = " + nombre.length());
        System.out.println("Nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Oswaldo\") = " + nombre.equals("Oswaldo"));
        System.out.println("nombre.equals(\"oswaldo\") = " + nombre.equals("oswaldo"));
        System.out.println("nombre.equals(\"oswaldo\") = " + nombre.equalsIgnoreCase("oswaldo"));
        System.out.println("nombre.compareTo(\"Oswaldo\") = " + nombre.compareTo("Oswaldo"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(6) = " + nombre.charAt(6));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1 , 4) = " + nombre.substring(1 , 4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));
        System.out.println("   trabalenguas  ");
        System.out.println("   trabalenguas  ".trim());
        
        

        



    }
}

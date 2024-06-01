public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion java";
        String curso2 = new String("programacion java");

        Boolean esIgual = curso == curso2;
        System.out.println("Es igual = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programacion java";
        esIgual = curso == curso3;
        System.out.println("Es igual = " + esIgual);
    }
}

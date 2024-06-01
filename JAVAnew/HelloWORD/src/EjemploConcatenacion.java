public class EjemploConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroa = 10;
        int numerob = 5;

        System.out.println(detalle +" "+ (numeroa + numerob));

        System.out.println(numeroa + numerob +" "+ detalle);

        String detalle2 = curso.concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}

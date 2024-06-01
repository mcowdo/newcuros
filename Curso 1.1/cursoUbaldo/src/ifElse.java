public class ifElse
{
    public static void main(String[] args)
    {
        boolean condicion = true;

        if(condicion)
        {
            System.out.println("Condicion veradera");
        }
        else
        {
            System.out.println("condicion falsa");
        }

        int numereo = 2;
        var numerotexto = "numero desconocido";

        if(numereo ==1)
        {
            numerotexto = "numero uno";
        }
        else if (numereo == 2)
        {
            numerotexto = "numero dos";
        }
        else
        {
            System.out.println("NUmero equivocado ");
        }
    }
}

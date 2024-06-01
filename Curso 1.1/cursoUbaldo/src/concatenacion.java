public class concatenacion
{
    public static void main(String[] args)
    {
        var usuario = "juan";
        var titulo = "ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(j+i);
        System.out.println( i + j +" "+ usuario);
        System.out.println(usuario+ (i + j));


    }
}

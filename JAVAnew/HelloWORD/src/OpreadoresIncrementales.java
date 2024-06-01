public class OpreadoresIncrementales {
    public static void main(String[] args)
    {
        //Pre incremento
        int i = 1;
        System.out.println("Inicial de i  " + i);
        int j = ++i; //i = i +1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post incremento
        
        i = 2;
        System.out.println("Inicial de i = " +i);
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Prdecremento

        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " +j);

        //post decremento

        i = 4;
        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));




    }
}

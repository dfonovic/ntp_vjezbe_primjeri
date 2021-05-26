import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int[] polje = new int[10];

    public static void main(String[] args) {
        System.out.println("Unesite 10 elemenata polja:");
        getInput();
        ispisPolja(polje);
        resizePolje();
        polje[10] = 67;
        polje[11] = 34;
        ispisPolja(polje);

    }

    private static void getInput()
    {
        for(int i = 0; i < polje.length; i++)
            polje[i] = sc.nextInt();
    }

    private static void ispisPolja(int[] p)
    {
        for(int i = 0; i < p.length; i++)
            System.out.print(p[i] + " ");
        System.out.println();
    }

    private static void resizePolje()
    {
        int[] original = polje; //kreiramo novu referencu na originalno polje   

        polje = new int[12];
        for (int i = 0; i < original.length; i++)
            polje[i] = original[i]; //ovdje stvarno kopiramo sadržaj objekta u memoriji 
    }

}

import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);
    private static Studenti studenti = new Studenti();

     public static void main(String[] args) {
         boolean quit = false;
         int choice = 0;
         printInstructions();
         while(!quit) {
             System.out.println("Unesi izbor: " );
             choice = sc.nextInt();
             sc.nextLine();

             switch(choice) {
                 case 0:
                     printInstructions();
                     break;
                 case 1:
                     studenti.ispisStudenata();
                     break;
                 case 2:
                     dodaj();
                     break;
                 case 3:
                     promijeni();
                     break;
                 case 4:
                     izbrisi();
                     break;
                 case 5:
                     trazi();
                     break;
                 case 6:
                     quit = true;
                     break;
             }
         }
    }

    public static void printInstructions() {
        System.out.println("\nPritisnite ");
        System.out.println("\t 0 - Za ispis izbornika.");
        System.out.println("\t 1 - Za ispis imena studenata u listi.");
        System.out.println("\t 2 - Za dodavanje studenta.");
        System.out.println("\t 3 - Za promijenu studenta.");
        System.out.println("\t 4 - Za brisanje studenta.");
        System.out.println("\t 5 - Za trazenje studenta.");
        System.out.println("\t 6 - Za kraj.");
    }

    public static void dodaj() {
        System.out.print("Unesite ime studenta ");
        studenti.dodajStudenta(sc.nextLine());
    }

    public static void promijeni() {
        System.out.print("Unesite poziciju: ");
        int poz = sc.nextInt();
        sc.nextLine();
        System.out.print("Unesite novo ime: ");
        String novi = sc.nextLine();
        studenti.promijeniStudenta(poz-1, novi);
    }

    public static void izbrisi() {
        System.out.print("Unesite poziciju: ");
        int poz = sc.nextInt();
        sc.nextLine();
        studenti.izbrisiStudenta(poz-1);

    }

    public static void trazi() {
        System.out.print("Trazi studenta: ");
        String trazi = sc.nextLine();
        if(studenti.traziStudenta(trazi) != null) {
            System.out.println(trazi + " nađen u listi");
        } else {
            System.out.println(trazi + " nije u listi");
        }
    }























}

/*
U Java kodu napisati klasu Razlomak kojom se modelira množenje razlomaka čiji su brojnik i nazivnik cijeli brojevi. 

Za pronalazak najvećeg zajedničkog dijeljitelja dva pozitivna broja koristite sljedeću metodu:

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }
*/

public class App {
    public static void main(String[] args) throws Exception {
        Razlomak razlomak1 = new Razlomak(5, 15);
        Razlomak razlomak2 = new Razlomak(7, 21);
        Razlomak razlomak3 = razlomak1.mnozenjerazlomaka(razlomak2);
        System.out.println("Množenje razlomaka " + razlomak1 + " * " + razlomak2 + " = " + razlomak3);
        
        
    }
}
public class Razlomak {
    private int brojnik;
    private int nazivnik;

    Razlomak(int brojnik, int nazivnik) {
        this.brojnik = brojnik;
        this.nazivnik = nazivnik;
        skratiRazlomak();
        
    }


        //ispis rjesenja u stringu
        public String toString() {
        return this.brojnik + "/" + this.nazivnik;
        }
       


    public int getBrojnik() {
        return this.brojnik;
    }

    public void setBrojnik(int brojnik) {
        this.brojnik = brojnik;
    }

    public int getNazivnik() {
        return this.nazivnik;
    }

    public void setNazivnik(int nazivnik) {
        this.nazivnik = nazivnik;
    }

    //Mnozenje razlomaka. argument metode je referenca na objekt (objekt kao parametar)
    public Razlomak mnozenjerazlomaka(Razlomak razlomak2) {
        int novibrojnik = brojnik * razlomak2.brojnik;
        int novinazivnik = nazivnik * razlomak2.nazivnik;
        Razlomak rjesenje = new Razlomak(novibrojnik, novinazivnik); //kreiramo novi objekt
        return rjesenje; // vracamo referencu na novi objekt
    }

    //metoda koja služi za skraćivanje razlomaka
    void skratiRazlomak() {
        int gcd = gcd(brojnik, nazivnik);
        brojnik = brojnik / gcd;
        nazivnik = nazivnik / gcd;
    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }
    
   

}

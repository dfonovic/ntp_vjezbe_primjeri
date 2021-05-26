import java.util.ArrayList;

public class Studenti {
    private ArrayList<String> upisaniStudenti = new ArrayList<String>();

    public void dodajStudenta(String ime) {
        upisaniStudenti.add(ime);
    }

    public void ispisStudenata() {
        System.out.println("U predmet je upisano: " + upisaniStudenti.size() + " studenata");
        for(int i=0; i< upisStudenata.size(); i++) {
            System.out.println((i+1) + ". " + upisStudenata.get(i));
        }
    }

    public void promijeniStudenta(int pozicija, String novoime) {
        upisaniStudenti.set(pozicija, novoime);
        System.out.println("Ime studenta na poziciji " + (pozicija+1) + " je promijenjeno.");
    }

    public void izbrisiStudenta(int pozicija) {
        String studenSt = upisaniStudenti.get(pozicija);
        upisaniStudenti.remove(pozicija);
    }

    public String traziStudenta(String student) {
                //boolean postoji = upisaniStudenti.contains(student);
        
                int pozicija = upisaniStudenti.indexOf(student);
                if(pozicija >=0) {
                    return upisaniStudenti.get(pozicija);
                }
        
                return null;
}
}
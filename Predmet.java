package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Predmet {

    private final String naziv;
    private final String sifraPredmeta;

    private List<Osoba> listaPredmeta = new ArrayList<>();

    private boolean postojiNastavnik = false;

    public Predmet(String naziv, String sifra) {
        this.naziv = naziv;
        sifraPredmeta = sifra;
    }

    public String getNaziv() { return naziv;}

    public String getSifra() { return sifraPredmeta;}

    public void dodajOsobu(Osoba osoba) throws GViseNastavnika{
        if(osoba instanceof Nastavnik){
            if(!postojiNastavnik){
                listaPredmeta.add(osoba);
                postojiNastavnik = true;
            }
            else throw new GViseNastavnika();
        }
        else listaPredmeta.add(osoba);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" (").append(sifraPredmeta).append(")\n");
        int i = 0;
        for(Osoba osoba : listaPredmeta){
            sb.append(osoba);
            if(++i < listaPredmeta.size())
                sb.append('\n');
        }
        return sb.toString();
    }
}

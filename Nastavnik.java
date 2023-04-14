package fakultet;

public class Nastavnik extends Osoba {

    private Zvanje zvanje;

    public enum Zvanje{doc, prof};

    public Nastavnik(String ime, String prezime, Zvanje zvanje) {
        super(ime, prezime);
        this.zvanje = zvanje;
    }

    @Override
    public char getOznaka() {
        return 'N';
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(zvanje.toString()).append(". dr ").append(ime).append(' ').append(prezime);
        return sb.toString();
    }
}

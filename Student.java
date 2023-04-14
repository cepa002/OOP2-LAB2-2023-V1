package fakultet;

public class Student extends Osoba {

    private static int brojStudenata=0;
    private final int godinaUpisa;
    private final int brojIndeksa;

    public Student(String ime, String prezime, int godinaUpisa) {
        super(ime, prezime);
        this.godinaUpisa = godinaUpisa;
        brojIndeksa = ++brojStudenata;
    }

    @Override
    public char getOznaka() {
        return 'S';
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(godinaUpisa).append('/').append(String.format("%04d - ", brojIndeksa));
        sb.append(ime).append(' ').append(prezime);
        return sb.toString();
    }

}

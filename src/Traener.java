public class Traener extends Person {
    protected String diciplin;

    public Traener(String navn, CPR cpr, int telNr, String mail, String diciplin) {
        super(navn, cpr, telNr, mail);
        this.diciplin = diciplin;
    }

    public String getDiciplin()
    {
        return this.diciplin;
    }

    @Override
    public String toString() {
        return super.toString() + "Diciplin: " + diciplin + "\n";
    }
}

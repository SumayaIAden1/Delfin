import java.time.format.DateTimeFormatter;

public class Traener extends Person
{
    protected String diciplin;

    public Traener(String navn, CPR cpr, int telNr, String mail, String diciplin)
    {
        super(navn, cpr,telNr, mail);
        this.diciplin = diciplin;

    }

    public String toString()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        return "Medlem: " + navn + "\n" +
                "Fødselsdag: " + cpr + "\n" +
                "TlfNr: " + telNr + "\n" +
                "Mail: " + mail + "\n" +
                "Diciplin: " + diciplin + "\n"
                ;

    }
}
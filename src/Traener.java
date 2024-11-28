import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Traener extends Person
{
    protected ArrayList<Person> traener;
    protected String diciplin;

    public Traener(String navn, int foedselsdag, int telNr, String mail, String diciplin)
    {
        super(navn, foedselsdag,telNr, mail);
        this.diciplin = diciplin;

    }

    public ArrayList<Person> getTraener()
    {
        return traener;
    }

    public String toString()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        return "Medlem: " + navn + "\n" +
                "Fødselsdag: " + foedselsdag + "\n" +
                "TlfNr: " + tlfNr + "\n" +
                "Mail: " + mail + "\n" +
                "Diciplin: " + diciplin + "\n"
                ;
    }
}

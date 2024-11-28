import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;

public class Medlem extends Person
{
    ArrayList<Person> person;
    protected LocalDate dato;
    protected int medlemsID;
    protected boolean erAktiv;


    public Medlem() {}

    public Medlem(String navn, int foedselsdag, int telNr,String mail, LocalDate dato, int medlemsID)
    {
        super(navn, foedselsdag,telNr, mail);
        this.dato = dato;
        this.medlemsID = medlemsID;
    }


    public ArrayList<Person> getPerson()
    {
        return person;
    }

    public LocalDate getDato()
    {
        return dato;
    }

    public int getMedlemsID()
    {
        return medlemsID;
    }

    public boolean isErAktiv()
    {
        return erAktiv;
    }

    public String toString()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        return "Medlem: " + navn + "\n" +
                "Fødselsdag: " + foedselsdag + "\n" +
                "TlfNr: " + tlfNr + "\n" +
                "Mail: " + mail + "\n" +
                "Oprettelsesdato: " + dato + "\n" +
                "MedlemsId: " + medlemsID + "\n"
                ;

    }
}

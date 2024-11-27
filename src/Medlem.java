import java.util.ArrayList;
import java.time.LocalDateTime;

public class Medlem extends Person
{
    ArrayList<Person> person;
    protected LocalDateTime dato;
    protected int medlemsID;
    protected boolean erAktiv;


    public Medlem()
    {
    }


    public ArrayList<Person> getPerson()
    {
        return person;
    }

    public LocalDateTime getDato()
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
}

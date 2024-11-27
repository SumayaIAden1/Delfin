import java.time.LocalDateTime;
import java.util.ArrayList;

public class Konkurrence
{
    protected String staevne;
    protected String placering;
    protected LocalDateTime dateTime;
    protected ArrayList<Medlem> deltagere;


    public Konkurrence() {}

    public String getStaevne()
    {
        return staevne;
    }

    public String getPlacering()
    {
        return placering;
    }

    public LocalDateTime getDateTime()
    {
        return dateTime;
    }

    public ArrayList<Medlem> getDeltagere()
    {
        return deltagere;
    }
}

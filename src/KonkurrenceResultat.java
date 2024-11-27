import java.util.ArrayList;

public class KonkurrenceResultat
{
    protected ArrayList<Konkurrence> konkurrence;
    protected int tid;
    protected String svoemmeDiciplin;
    protected int distance;

    public KonkurrenceResultat(){}

    public ArrayList<Konkurrence> konkurrence()
    {
        return konkurrence;
    }

    public int getTid()
    {
        return tid;
    }

    public String getSvoemmeDiciplin()
    {
        return svoemmeDiciplin;
    }

    public int getDistance()
    {
        return distance;
    }
}

import java.util.ArrayList;

public class MedlemmerPersistens
{
    protected ArrayList<Medlem> medlemmer = new ArrayList<>();

    public MedlemmerPersistens() {}

    public ArrayList<Medlem> getMedlemmer()
    {
        return medlemmer;
    }
}
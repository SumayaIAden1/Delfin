public abstract class Medlemstype implements Medlemsstatus
{
    protected String type;
    protected String aktivitetsForm;

    public Medlemstype()
    {
    }

    public Medlemstype(String type, String aktivitetsForm)
    {
        this.type = type;
        this.aktivitetsForm = aktivitetsForm;
    }

    public String getType()
    {
        return type;
    }

    public String getAktivitetsForm()
    {
        return aktivitetsForm;
    }

    public String erAktiv()
    {
        return "Medlemstype er aktiv";
    }

    public String erPassiv()
    {
        return "Medlemstype er passiv";
    }
}

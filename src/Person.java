public class Person
{
    protected String navn;
    protected int alder;
    protected int tlfNr;
    protected String mail;

    public Person(){}

    public Person(String navn, int alder, int tlfNr, String mail)
    {
        this.navn = navn;
        this.alder = alder;
        this.tlfNr = tlfNr;
        this.mail = mail;
    }

    public String getNavn()
    {
        return navn;
    }

    public int getAlder()
    {
        return alder;
    }

    public int getTlfNr()
    {
        return tlfNr;
    }

    public String getMail()
    {
        return mail;
    }
}

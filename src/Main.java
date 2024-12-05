import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {

        MedlemsOversigt medlemsOversigt = new MedlemsOversigt();
        medlemsOversigt.addAlleMedlemmeretoRestanceList();

        MedlemPersistens medlemsPersistens = new MedlemPersistens();
        medlemsPersistens.writeMedlemPersistens(medlemsOversigt.getMedlemmerOversigt());

        RestancePersistens restancePersistens = new RestancePersistens(medlemsOversigt);
        restancePersistens.writeRestancePersistens();

        // Opret TraenerPersistens objekt og skriv trænere til fil

        TraenerOversigt traenerOversigt = new TraenerOversigt();
        TraenerPersistens traenerPersistens = new TraenerPersistens(traenerOversigt.getTraenerListe());
        traenerPersistens.writeTraenerToFile();




    }
}

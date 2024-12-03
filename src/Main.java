import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        // Opret MedlemsOversigt objekt og tilføj medlemmer i restancen
        MedlemsOversigt medlemsOversigt = new MedlemsOversigt();
        medlemsOversigt.addAlleMedlemmeretoRestanceList();

        // Opret RestancePersistens objekt og skriv restancen til fil
        RestancePersistens restancePersistens = new RestancePersistens(medlemsOversigt);
        restancePersistens.writeRestancePersistens();

        // Udskriv medlemsoversigt eller restanceliste til konsollen
        System.out.println("Medlemsoversigt:");
        System.out.println(medlemsOversigt);  // Udskriv oversigt over medlemmerne
        System.out.println("\nRestanceliste skrevet til fil.");

        // Opret Traener-oversigt
        TraenerOversigt traenerOversigt = new TraenerOversigt();

        // Opret TraenerPersistens objekt og skriv trænere til fil
        TraenerPersistens traenerPersistens = new TraenerPersistens(traenerOversigt.getTraenerListe());
        traenerPersistens.writeTraenerToFile();




    }
}

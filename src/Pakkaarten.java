import java.util.ArrayList;

public class Pakkaarten {

    // Variabele declaratie
    private ArrayList<Kaart> kaarten;

    //Pakkaarten vullen
    public Pakkaarten() {
        this.kaarten = new ArrayList<Kaart>();
    }
    public void vulPakkaarten() {
        // Per soort en waarde een kaart aanmaken in het pak kaarten.
        for (Soort kaartSoort : Soort.values()) {
            for (Waarde kaartWaarde : Waarde.values()) {
                this.kaarten.add(new Kaart(kaartSoort, kaartWaarde));
            }
        }
    }
    public String toString() {
        String kaartenLijst = "";
        int i = 0;
        for (Kaart eenKaart: this.kaarten) {
            kaartenLijst += "\n" + i + "-" + eenKaart.toString();
            i++;
        }
        return kaartenLijst;
    }
}

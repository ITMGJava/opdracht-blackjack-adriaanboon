public class Kaart {

    private Soort soort;
    private Waarde waarde;

    public Kaart (Soort soort, Waarde waarde) {
        this.waarde=waarde;
        this.soort=soort;
    }
    public String toString() {
        return this.soort.toString() + "-"+ this.waarde.toString();
    }
    public Waarde getWaarde() {
        return this.waarde;
    }
}

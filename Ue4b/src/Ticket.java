abstract class Ticket {
    public float preis;
    public boolean entwertet = false;
    enum Zone { A, B, C };

    public Ticket(float preis) {
        this.preis = preis;
    }

    public float getPreis() {
        return preis;
    }

    public void entwerten() {
        entwertet = true;
    }

    public boolean istEntwertet() {
        return entwertet ? true : false;
    }

    public abstract boolean gueltigInZone(Zone zone);
}
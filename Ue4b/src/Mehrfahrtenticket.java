import java.util.StringJoiner;

public class Mehrfahrtenticket extends Ticket{
    public int fahrten;
    Ticket.Zone zone;
    public Mehrfahrtenticket(float preis, int f, Ticket.Zone zone) {
        super(preis);
        this.fahrten = f;
        this.zone = zone;
    }

    @Override
    public boolean gueltigInZone(Zone zone) {
        return this.zone == zone;
    }

    public int getFahrten() {
        return fahrten;
    }

    public Zone getZone() {
        return zone;
    }

    @Override
    public void entwerten() {
        if(fahrten>1){
            fahrten--;
        } else {
            fahrten--;
            entwertet=true;
        }
    }

    @Override
    public float getPreis() {
        return super.getPreis();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Mehrfahrtenticket.class.getSimpleName() + " [", "]")
                .add("fahrten=" + fahrten)
                .add("zone=" + zone)
                .add("preis=" + preis)
                .add("entwertet=" + entwertet)
                .toString();
    }
}

import java.util.StringJoiner;

public class Einzelticket extends Ticket{
    Ticket.Zone zone;
    String verfallsDatum;
    public Einzelticket(float preis,String vd, Ticket.Zone z) {
        super(preis);
        this.verfallsDatum = vd;
        this.zone = z;
    }

    @Override
    public boolean gueltigInZone(Zone zone) {
        return this.zone == zone;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Einzelticket.class.getSimpleName() + " [", "]")
                .add("zone=" + zone)
                .add("verfallsDatum=" + verfallsDatum)
                .add("preis=" + preis)
                .add("entwertet=" + entwertet)
                .toString();
    }

    public Zone getZone() {
        return zone;
    }

    public String getVerfallsDatum() {
        return verfallsDatum;
    }
}

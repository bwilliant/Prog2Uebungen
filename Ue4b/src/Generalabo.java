import java.util.StringJoiner;

public class Generalabo extends Ticket{
    public String inhaber;
    public String verfallsDatum;
    public Generalabo(float preis, String in, String vd) {
        super(preis);
        this.inhaber = in;
        this.verfallsDatum = vd;
    }

    @Override
    public boolean gueltigInZone(Zone zone) {
        return true;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Generalabo.class.getSimpleName() + " [", "]")
                .add("inhaber=" + inhaber)
                .add("verfallsDatum=" + verfallsDatum)
                .add("preis=" + preis)
                .add("entwertet=" + entwertet)
                .toString();
    }

    @Override
    public void entwerten() {
    }

    public String getInhaber() {
        return inhaber;
    }

    public String getVerfallsDatum() {
        return verfallsDatum;
    }
}

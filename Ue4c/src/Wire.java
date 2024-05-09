import java.util.StringJoiner;

public class Wire implements Mobile{
    Mobile m1;
    Mobile m2;
    double length;
    private double knotenPos;
    private double m1l;
    private double m2l;

    public Wire(Mobile m1, Mobile m2, double length){
            this.m1 = m1;
            this.m2 = m2;
            this.length = length;
            this.m2l = length;
            this.knotenPos=0.5;
    }
    @Override
    public double weight() {
        return m1.weight() + m2.weight();
    }

    @Override
    public void balance() {
        double m1length = knotenPos * length;
        double m2length = (1-knotenPos)*length;

        if (m1.weight()*m1length != m2.weight()*m2length){
            knotenPos = (m2.weight()*m2length) / (m1.weight()*m1length + m2.weight()*m2length);
        }
        m1.balance();
        m2.balance();

        m1l = length*knotenPos;
        m2l = (m1l==length? length:length - m1l);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Mobile.class.getSimpleName() + "[", "]")
                .add(m1l+":"+m1)
                .add(m2l+":"+m2)
                .toString();
    }
}

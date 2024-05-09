import java.util.StringJoiner;

public class Star implements Mobile{
    private double weight;
    public Star(double w){
        if(w <= 0){
            throw new IllegalArgumentException("nur positive Zahlen");
        }
        this.weight=w;
    }
    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public void balance() {
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Star.class.getSimpleName() + "[", "]")
                .add(String.format("%.1f", weight))
                .toString();
    }
}

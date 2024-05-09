public class Dozent extends Person{
    String lehrgebiet;
    public Dozent( String vn,String nn, String sn, String hn, String o, int plz,String lg){
        super(vn,nn,sn,hn,o,plz);
        this.lehrgebiet = lg;

    }

    @Override
    public String toString() {
        return "Dozent [" +
                "lehrgebiet=" + lehrgebiet +
                ", nachname=" + nachname +
                ", vorname=" + vorname +
                ", strassenname=" + strassenname +
                ", hausnummer=" + hausnummer +
                ", ort=" + ort +
                ", postleitzahl=" + postleitzahl +
                ']';
    }

    public String getLehrgebiet() {
        return lehrgebiet;
    }

    public void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }
}

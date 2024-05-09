public class Student extends Person{
    int matrikelNummer;
    public Student(String vn,String nn, String sn, String hn, String o, int plz,int mtr){
        super(vn,nn,sn,hn,o,plz);
        this.matrikelNummer=mtr;
    }

    @Override
    public String toString() {
        return "Student [" +
                "matrikelNummer=" + matrikelNummer +
                ", nachname=" + nachname  +
                ", vorname=" + vorname  +
                ", strassenname=" + strassenname  +
                ", hausnummer=" + hausnummer  +
                ", ort=" + ort  +
                ", postleitzahl=" + postleitzahl +
                ']';
    }

    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public void setMatrikelNummer(int matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }
}

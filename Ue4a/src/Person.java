public class Person {

    String nachname;
    String vorname;
    String strassenname;
    String hausnummer;
    String ort;
    int postleitzahl;
    public Person(String vn,String nn, String sn, String hn, String o, int plz){
        this.nachname=nn;
        this.vorname=vn;
        this.strassenname=sn;
        this.hausnummer=hn;
        this.ort=o;
        this.postleitzahl=plz;

    }

    @Override
    public String toString() {
        return "Person [" +
                "nachname=" + nachname +
                ", vorname=" + vorname +
                ", strassenname=" + strassenname +
                ", hausnummer=" + hausnummer +
                ", ort=" + ort +
                ", postleitzahl=" + postleitzahl +
                ']';
    }

    public static void Main() {
        Student a = new Student("Peter","Müller", "Hauptstrasse", "4a", "Coburg", 96450,455555);
        Dozent b = new Dozent("Dieter", "Landes", "Am Ring","12", "Coburg", 96450,"Software Engineering");
        Person c = new Person("Tim","Schmitt", "Ayinger Str.", "4a", "München", 89006);
        Student d = new Student("Yvonne", "Hinz", "Bahnhofstr", "30", "Nürnberg", 91000,41622);
        Dozent e = new Dozent("Claudia", "Ehrlicher", "Am Baum", "12", "Berlin", 30323,"Ethik");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getStrassenname() {
        return strassenname;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public String getOrt() {
        return ort;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setStrassenname(String strassenname) {
        this.strassenname = strassenname;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }
}
//Student [matrikelNummer=455555, nachname=Müller, vorname=Peter, strassenname=Hauptstrasse, hausnummer=4a, ort=Coburg, postleitzahl=96450]
//Dozent [lehrgebiet=Software Engineering, nachname=Landes, vorname=Dieter, strassenname=Am Ring, hausnummer=12, ort=Coburg, postleitzahl=96450]
//Person [nachname=Schmitt, vorname=Tim, strassenname=Ayinger Str., hausnummer=4a, ort=München, postleitzahl=89006]
//Student [matrikelNummer=41622, nachname=Hinz, vorname=Yvonne, strassenname=Bahnhofstr, hausnummer=30, ort=Nürnberg, postleitzahl=91000]
//Dozent [lehrgebiet=Ethik, nachname=Ehrlicher, vorname=Claudia, strassenname=Am Baum, hausnummer=12, ort=Berlin, postleitzahl=30323]
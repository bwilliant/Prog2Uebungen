public class testingPerson {
    public static void main(String[] args) {
        Student aStudent = new Student("Peter", "Müller", "Hauptstrasse", "4a", "Coburg",96450, 455555 );
        Dozent aDozent = new Dozent("Hans", "Meyer", "Jenaerstrasse", "21", "Coburg",96450, "Betriebssysteme" );

        System.out.println(aStudent);
        System.out.println(aDozent);
    }
//    public static void main(String[] args) {
//        Person.Main();
//    }
}

public class TestTicket {
    public static void main(String[] args) {

        Ticket t = new Generalabo(250, "Peter Mustermann", "31.12.2030");
        t.entwerten();
        t.entwerten();
        t.entwerten();
        t.entwerten();
        System.out.println(t);
    }
}

public class TestMobile {
    public static void main(String[] args) {
        Star a = new Star(2);
        Star b = new Star(4);
        Wire ab = new Wire(a, b, 9);

        ab.balance();

        System.out.println(ab);
    }
}

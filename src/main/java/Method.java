public class Method {

    public static int tax(int earnings) {

        return earnings * 6 / 100;
    }

    public static int taxEarningMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        return Math.max(tax, 0);
    }
}
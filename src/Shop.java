public class Shop {
    private static String name;
    private static double income = 0;

    public static void income(double input){
        income += input;
    }

    public static double getIncome() {
        return income;
    }
}

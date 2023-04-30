public class Review01 {

    public static void main(String[] args) {

        int price = 1500;
        int tax = tax(price);
        int result = price + tax;
        System.out.println(price + "円の税込価格は" + result + "円(消費税は" + tax + "円）です。" );
    }

    public static int tax(int price) {

        double taxRate = 0.1;
        int tax = (int) (price * taxRate);
        return tax;
    }
}

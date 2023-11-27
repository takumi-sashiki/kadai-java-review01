
public class Review01 {

    public static void main(String[] args) {

        int price = 1000;
        int total = price + tax(price);

        System.out.println(price +"円の商品の税込価格は" + total + "円（消費税は" + tax(price) + "円）です。");
    }

    public static int tax(int price) {
        int result = (int) (price * 0.1);
        return result;
    }
}

public class Clock {

    public static void main(String[] args) {
        int second = getSeconds(18, 32, 47);
        System.out.println(second);
    }

    public static int getSeconds(int h, int m, int s) {
        int result = h * 3600 + m * 60 + s;
        return result;

    }
}

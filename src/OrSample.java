
public class OrSample {

    public static void main(String[] args) {
        int scoreSansu = 80;
        int scoreKokugo = 80;

        if (scoreSansu >= 60 && scoreKokugo >= 60) {
            System.out.println("goukaku");
        } else if (scoreSansu >= 60 || scoreKokugo >= 60) {
            System.out.println("katahouhosyuu");
        } else {
            System.out.println("hosyuu");
        }
    }
}

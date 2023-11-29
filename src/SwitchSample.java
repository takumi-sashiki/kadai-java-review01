
public class SwitchSample {

    public static void main(String[] args) {
        int score = 59;

        int rank = ranking(score);

        switch (rank) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("akaten");
            break;
        case 6:
        case 7:
            System.out.println("goukaku");
            break;
        case 8:
        case 9:
            System.out.println("yokudekimasita");
            break;
        case 10:
            System.out.println("manten");
            break;
        default:
            System.out.println("tensuunyuuryoku");
            break;
        }
    }

    public static int ranking(int score) {
        if (score < 0) {
            return -1;
        } else if (score > 100) {
            return 11;
        } else {
            return score / 10;
        }
    }
}

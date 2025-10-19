package ifExample;

public class SwitchCase {
    public static void main(String[] args) {
        int ranking = 1;
        char medal;

        switch (ranking) {
            case 1 : medal = 'G';
                    break;
            case 2 : medal = 'S';
                break;
            case 3 : medal = 'B';
                break;
            default:
                medal = 'A';
                break;
        }
        System.out.println(ranking + "등의 색깔은 " + medal + "입니다.");
    }
}

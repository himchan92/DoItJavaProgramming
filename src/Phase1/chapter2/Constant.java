package Phase1.chapter2;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0; //초기화 필수, 안하면 에러
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}

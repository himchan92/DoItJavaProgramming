package chapter2;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final int MIN_NUM; //대문자 이음새는 언더바 권장

        MIN_NUM = 0; //초기화 필수

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        final int MY_AGE = 22;
        System.out.println(MY_AGE);
    }
}

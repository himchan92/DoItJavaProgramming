package chapter2;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0; //상수는 초기화 안하면 오류

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}

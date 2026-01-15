package loopexample;

public class Ex5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("안녕하세요"+i);
        }
        System.out.println();

        int num;

        for(num = 1; num <= 100; num++) {
            if(num % 3 != 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}

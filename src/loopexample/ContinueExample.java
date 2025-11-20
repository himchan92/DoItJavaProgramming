package loopexample;

public class ContinueExample {
    public static void main(String[] args) {
        int total = 0;
        int num;

        for(num = 1; num <= 100; num++) {
            if(num % 2 == 0)
                continue; //조건만족시 건너뛰기
            total += num;
        }

        System.out.println(total);
    }
}

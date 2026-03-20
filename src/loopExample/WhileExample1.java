package loopExample;

public class WhileExample1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while(num <= 50) {
            sum += num;
            num++;
        }
        System.out.println("1~50 sum " + sum);
    }
}

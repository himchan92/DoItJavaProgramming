package part1.loopExample;

public class Ex5 {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        for(num = 1; ; num++) {
            sum += num;
            if(sum > 500) {
                break;
            }
        }
        System.out.println(sum);
        System.out.println(num);
    }
}

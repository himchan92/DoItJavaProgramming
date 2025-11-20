package Phase1.loopexample;

public class Ex3 {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            for(int j = 2; j < 10; j++) {
                if(j < i) {
                    break;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

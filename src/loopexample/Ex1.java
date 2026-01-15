package loopexample;

public class Ex1 {
    public static void main(String[] args) {
        char operator = '+';
        int num1 = 10;
        int num2 = 2;
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;
        }

        System.out.println(result);
    }
}

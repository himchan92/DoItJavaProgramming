package operator;

public class OperationEx3 {
    public static void main(String[] args) {
        int myAge = 23;
        int teacher = 38;

        boolean value = (myAge > 25);
        System.out.println(value);

        System.out.println(myAge <= 25);
        System.out.println(myAge == teacher);

        char ch;
        ch = (myAge > teacher) ? 'T' : 'F';
        System.out.println(ch);
    }
}

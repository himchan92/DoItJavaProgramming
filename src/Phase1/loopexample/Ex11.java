package Phase1.loopexample;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();

        System.out.println("2부터 " + n + "까지의 소수:");

        // 1. 반복문 (for)의 대상 수정: i를 2부터 n까지 증가시키면서 소수인지 확인합니다.
        for(int i = 2; i <= n; i++) {
            // 2. 함수 호출 대상 수정: isPrime(n) 대신 isPrime(i)를 호출해야 합니다.
            // 3. 함수 이름 수정: isPrice 대신 isPrime으로 변경하는 것이 의미상 적절합니다.
            if(isPrime(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    // 소수 판별 함수
    // 'isPrice'가 아닌 'isPrime'으로 변경 (Prime = 소수)
    private static boolean isPrime(int num) {
        // 4. 매개변수 이름 수정: 기존 n 대신 num으로 변경하여 main 메서드의 n과 혼동 방지
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) // 나누어 떨어지면 (소수가 아닐 경우)
                return false;
        }
        return true;
    }
}
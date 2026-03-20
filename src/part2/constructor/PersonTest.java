package part2.constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(); //생성자 : 초기화역할
        Person person1 = new Person("이름");

        Person person2 = new Person("이순신", 175, 83); //인스턴스 변수 초기화 동시에 생성
    }
}

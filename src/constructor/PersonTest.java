package constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(); //디폴트외에 별도 생성자 있으면 디폴트 명시없을시 에러
        person.name = "홍길동";
        person.weight = 85.5F;
        person.height = 180.0F;

        Person person1 = new Person("이순신", 175, 75);
    }
}

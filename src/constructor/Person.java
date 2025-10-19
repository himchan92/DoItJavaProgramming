package constructor;

public class Person {
    String name;
    float height;
    float weight;

    public Person() {} // 디폴트 생성자로 내장되어있음

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

package constructor;

public class Person {
    String name;
    float height;
    float weight;

    //내부적으로 기본생성자 탑재
    public Person() {}

    public Person(String pname) {
        name = pname;
    }

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

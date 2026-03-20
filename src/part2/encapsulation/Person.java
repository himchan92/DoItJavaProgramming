package part2.encapsulation;

public class Person {
    private int age;
    private String name;
    private boolean isMarried;
    private int count;

    public Person(int age, String name, boolean isMarried, int count) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        this.count = count;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void info() {
        System.out.println("나이가 " + getAge() + ", 이름이 " + getName() + "라는 남자. 이남자는 결혼을 " + (isMarried() ? "했고 ": " 안했고 ")
        + "자식이 " + getCount() + "있습니다.");
    }
}

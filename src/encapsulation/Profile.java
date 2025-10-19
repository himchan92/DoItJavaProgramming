package encapsulation;

public class Profile {
    int age;
    String name;
    boolean isMarried;
    int childCnt;

    public void show() {
        System.out.println("나이가 " + age + ", 이름이 " + name + "남자가 있습니다.");
        if(isMarried) {
            System.out.println("이사람은 결혼 했고 자녀가 " + childCnt + "명 있습니다.");
        }
        else {
            System.out.println("이사람은 미혼입니다.");
        }
    }
}

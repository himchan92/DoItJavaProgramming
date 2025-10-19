package encapsulation;

public class ProfileTest {
    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.age = 40;
        profile.name = "James";
        profile.isMarried = true;
        profile.childCnt = 3;
        profile.show();
    }
}

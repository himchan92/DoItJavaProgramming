package constructor;

public class StudentTest {
    public static void main(String[] args) {
        Student2 student2 = new Student2(1001, "Lee");

        student2.setKoreanSubject("국어", 100);
        student2.setMathSubject("수학", 50);

        Student2 student3 = new Student2(1002, "Kim");
        student3.setKoreanSubject("국어", 70);
        student3.setMathSubject("수학", 85);

        student2.showInfo();
        student3.showInfo();
    }
}

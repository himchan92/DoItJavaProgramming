package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student ann = new Student();
        ann.studentName = "ann";

        System.out.println(ann.studentName);
        System.out.println(ann.getStudentName());

        Student kim = new Student();
        kim.studentName = "kim";
        System.out.println(kim.studentName);
        System.out.println(kim.getStudentName());
    }
}

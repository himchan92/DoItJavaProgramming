package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "안연수";

        System.out.println(student.studentName);
        System.out.println(student.getStudentName());
    }
}

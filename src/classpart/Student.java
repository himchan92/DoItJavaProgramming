package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "Ann";

        System.out.println(student.studentName);
        System.out.println(student.getStudentName());
    }
}

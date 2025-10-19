package constructor;

public class Student2 {
    int studentID;
    String studentName;
    Subject2 korean;
    Subject2 math;

    public Student2(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        korean = new Subject2();
        math = new Subject2();
    }

    public void showInfo() {
        System.out.println(studentName + "님의 " + korean.getSubjectName() + "과목의 점수는 " + korean.getScorePoint());
    }

    public void setKoreanSubject(String subjectName, int score) {
        korean.setSubjectName(subjectName);
        korean.setScorePoint(score);
    }

    public void setMathSubject(String subjectName, int score) {
        math.setSubjectName(subjectName);
        math.setScorePoint(score);
    }
}

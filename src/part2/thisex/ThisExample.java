package part2.thisex;

class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        BirthDay bd = new BirthDay();
        bd.setYear(2000);
        System.out.println(bd);
        bd.printThis();
    }
}

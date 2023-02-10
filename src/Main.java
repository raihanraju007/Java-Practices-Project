public class Main {
    public static void main(String[] args) {

        Student raihan = new Student();
        raihan.roll = 07;
        raihan.name = "Md Raihan Hossin";
        raihan.marks = 80.5f;

        System.out.println(raihan.roll);
        System.out.println(raihan.name);
        System.out.println(raihan.marks);
    }
}
class Student{
    int roll;
    String name;
    float marks;

}
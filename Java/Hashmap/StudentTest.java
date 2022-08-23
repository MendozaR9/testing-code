package Java.Hashmap;

public class StudentTest {
    public static void main(String[] args) {
        Students students1 = new Students("joe");
        students1.addGrades(5);
        students1.addGrades(6);
        students1.addGrades(4);
        students1.addGrades(9);
        System.out.println(students1.getGradeAverage());
    }
}

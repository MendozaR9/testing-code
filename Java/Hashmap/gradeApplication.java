package Java.Hashmap;

import java.util.HashMap;

public class gradeApplication {
    public static void main(String[] args) {
        HashMap<String, Students> students = new HashMap<>();

        Students students1 = new Students("Joe");
        Students students2 = new Students("Chase");
        Students students3 = new Students("Michael");

      giveGrades(students1, 90, 100, 80);
      giveGrades(students2, 50, 60 ,75);
      giveGrades(students3, 100, 100, 100);

      students.put("JoeMan", students1);
      students.put("Chuckster", students2);
      students.put("M-dog", students3);

     gradeApp(students);
    }

    public static void gradeApp(HashMap student){
        System.out.println(student);
        System.out.println("Welcome!\n "+
                "Here are the GitHub Username of our Students:\n");
    }

    public static void giveGrades(Students students, int grade1, int grade2, int grade3){
        students.addGrades(grade1);
        students.addGrades(grade2);
        students.addGrades(grade3);
    }
}

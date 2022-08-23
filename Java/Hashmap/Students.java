package Java.Hashmap;

import java.util.ArrayList;

public class Students {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Students(String name) {
        this.name = name;
    }

    public Students() {
    }

    public String getName(){
        return name;
    }

public void addGrades(int grade){
        this.grades.add(grade);
}

public double getGradeAverage(){
        double average = 0;
        for(int grade : this.grades){
            average+=grade;
        }
        return average / this.grades.size();
}

}

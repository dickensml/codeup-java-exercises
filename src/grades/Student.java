package grades;
import java.util.ArrayList;
public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public int getGradeAverage() {
        int sum = 0;
        int length = grades.size();
        for (Integer grade : grades) {
            sum = sum + grade;
        }
        return sum / length;
    }
}
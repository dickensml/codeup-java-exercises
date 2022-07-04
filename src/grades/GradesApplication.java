package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Student leroy = new Student("Leroy");
        Student bill = new Student("Bill");
        Student sheila = new Student("Sheila");
        Student katy = new Student("Katy");

        leroy.addGrade(88);
        leroy.addGrade(92);
        leroy.addGrade(74);
        bill.addGrade(93);
        bill.addGrade(68);
        bill.addGrade(83);
        sheila.addGrade(100);
        sheila.addGrade(92);
        sheila.addGrade(87);
        katy.addGrade(95);
        katy.addGrade(92);
        katy.addGrade(97);


        HashMap<String, Student> students = new HashMap<>();
        students.put("Jenkins", leroy);
        students.put("Ghostbuster", bill);
        students.put("E.theDrummer", sheila);
        students.put("WonderWoman", katy);

        //command line output
        System.out.println("Welcome!\n");
        System.out.println("Here are our students' Github usernames:\n");
        //this is how to loop a hashmap do not forget the .entryset()
        for (Map.Entry<String, Student> student :
                students.entrySet()) {
            System.out.print(student.getKey() + "," + " ");
        }
        Scanner scanner = new Scanner(System.in);
        String continueGrades;
        do {
            System.out.println("\nWhat student would you like to see more information on?\n\n >");
            String input = scanner.next() + scanner.nextLine();
            if (students.containsKey(input)) {
                System.out.println("\nName: " + students.get(input).getName() + " - Github Username: " + input + "\nCurrent Average: " + students.get(input).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + input + ".");
            }
            System.out.println("\nWould you like to see another student? (y/n) \n\n >");
            continueGrades = scanner.next();
        } while (continueGrades.equalsIgnoreCase("y"));
    }
}
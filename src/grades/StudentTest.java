package grades;

public class StudentTest {

    public static void main(String[] args) {

//       Student student = new Student("Student");
       Student leroy = new Student("Leroy");
       Student bill = new Student("Bill");
       Student sheila = new Student("Sheila");
       Student katy = new Student("Katy");
//       student1.addGrade(3);

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

        System.out.println(katy.getGradeAverage());

    }
}

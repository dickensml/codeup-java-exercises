public class ConsoleIO {


    public static void main(String[] args) {

        String cohort = "Go";
        String timeOfDay = "afternoon";
        byte week = 11;
        float someNumber = 123.456F;

        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
        System.out.println("This is not actually going to appear on another line");
//        System.out.printf("The chosen number is %f%n", someNumber);

//        to specify how many digits left and right of decimal
        System.out.printf("The chosen number is %08.2f%n", someNumber);
    }
}
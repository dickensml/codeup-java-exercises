import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConsoleIO {


    public static void main(String[] args) {

        String cohort = "Go";
        String timeOfDay = "afternoon";
        byte week = 11;
        float someNumber = 123.456F;

//        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        System.out.println("This is not actually going to appear on another line");
////        System.out.printf("The chosen number is %f%n", someNumber);
//
////        to specify how many digits left and right of decimal--------------
////        System.out.printf("The chosen number is %08.2f%n", someNumber);
//
////        to specify spacing between end of text and the number/item. -------------
//        System.out.printf("The chosen number is %58.2f%n", someNumber);

//

        Scanner scanner = new Scanner (System.in);
//        System.out.println("Enter a string: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("Your input was %s", userInput);

//        System.out.println("Hello.  What is your name?");
//        String userInput = scanner.nextLine();
//        System.out.printf("Nice to meet you %s.", userInput);

        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);


    }

}
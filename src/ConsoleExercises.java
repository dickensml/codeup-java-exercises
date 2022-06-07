import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        1.  pi exercise
//        double pi = 3.14159;
////        System.out.println("The value of pi is approximately " +  pi);
//        System.out.printf("The value of pi is approximately %2.7f%n", pi);

//      -----  System.out.printf("The chosen number is %58.2f%n", someNumber);   ------

//        -----  Explore Scanner class  -------

//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Enter a string: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("Your input was %s", userInput);

        Scanner scanner = new Scanner (System.in);
//        System.out.println("Enter an Integer: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("Your integer is: %s", userInput);

//        String wordOne;
//        String wordTwo;
//        String wordThree;
//
//        System.out.println("Enter three words: ");
//        wordOne = scanner.next();
//        wordTwo = scanner.next();
//        wordThree = scanner.next();
//        System.out.println("Your three words are: \n" + wordOne +"\n" + wordTwo + "\n" + wordThree);

//        String inputSentence;
//        System.out.println("Please type a sentence.");
//        inputSentence = scanner.nextLine();
//        System.out.println("This is your sentence: "  + inputSentence);

//           --------   3.  Calculate perimeter and area  ------


        System.out.println("Please enter the length of your room.");
        String length = scanner.nextLine();
        System.out.println("Please enter the width of your room.");
        String width = scanner.nextLine();
        int perimeter = (Integer.parseInt(length) + Integer.parseInt(width)) * 2;
        System.out.printf("The perimeter of your room is %d%n", perimeter);

//          -----  do area, too -----


    }
}

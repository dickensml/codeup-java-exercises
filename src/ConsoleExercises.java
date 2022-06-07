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

        String wordOne;
        String wordTwo;
        String wordThree;

        System.out.println("Enter three words: ");
        wordOne = scanner.next();
        wordTwo = scanner.next();
        wordThree = scanner.next();
        System.out.println("Your three words are: \n" + wordOne +"\n" + wordTwo + "\n" + wordThree);


    }
}

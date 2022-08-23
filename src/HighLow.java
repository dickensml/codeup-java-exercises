import java.util.Scanner;

public class HighLow {

    public static void init() {
        System.out.println("Welcome to the High / Low Game!");

        int randomNum = (int) (Math.random() * 100 +1);

        int randomNumber = (int)randomNum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int guess = Integer.parseInt(scanner.next());

        if (guess == randomNum) {
            System.out.println("GOOD GUESS!");
        } else if (guess < randomNum) {
            System.out.println("HIGHER");
        }else {
            System.out.println("LOWER");
        }
//  has to run again or a number of guess until number is chosen
    }

    public static void main(String[] args) {
        init();
    }



}

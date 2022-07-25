import java.util.Scanner;

public class MethodExercises {

    //     1.  -----
//    public static double addy(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    public static double subby(double num1, double num2) {
//        return num1 - num2;
//    }
//
//    public static double multy(double num1, double num2) {
//        return num1 * num2;
//    }
//
//    public static double divvy(double num1, double num2) {
//        return num1 * num2;
//    }
//
//    public static double moddy(double num1, double num2) {
//        return num1 % num2;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(addy(5, 5));
//        System.out.println(subby(20, 13));
//        System.out.println(multy(4, 5));
//        System.out.println(divvy(100, 0));
//        System.out.println(divvy(10, 3));
//    }

    //   2.  -----------------


        public static int getInteger ( int min, int max) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number between " + min + " and " + max);
            int userInt = sc.nextInt();
            if (userInt >= min && userInt <= max) {
                return userInt;
            } else {
                System.out.println("Input out of range.");
                return getInteger(min, max);
            }
        }

    public static void main(String[] args) {


            System.out.print("Enter a number between 1 and 10: ");
            int userInput = getInteger(1, 10);

            System.out.println("You entered : " + userInput);

        }
    }


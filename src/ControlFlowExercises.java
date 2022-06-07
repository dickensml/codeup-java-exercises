import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {


//          1.  a. While
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
////      }
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//         1. b. Do While
//        int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//        } while (num <= 100) ;

//        int num = 100;
//        do {
//            System.out.println(num);
//            num -= 5;
//        } while (num >= -10) ;

//            long num = 2;
//            do {
//                System.out.println(num);
//                num *= num;
//            } while (num < 1000000);

//        for(long num = 2; num <= 100; num += 2) {
//            System.out.println(num);
//        }
//
//        for(long num = 2; num <1000000; num *= num){
//            System.out.println(num);
//        }

//        for(long num = 1; num <= 100; num++) {
//            if (num % 3 == 0 & num % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (num % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (num % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(num);
//            }
//        }
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter a number.");
        String num = scanner.nextLine();
        int tableNum = (Integer.parseInt(num)*= Integer.parseInt(num));
        System.out.println(tableNum);

    }
}

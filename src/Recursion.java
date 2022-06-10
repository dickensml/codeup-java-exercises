public class Recursion {

    public static void main(String[] args) {
        recur(1);
    }

    public static void recur(int times) {
        System.out.println("Recurring..." + times);
        if (times == 100) {
            return;
        }
        recur(times + 1);
    }

}
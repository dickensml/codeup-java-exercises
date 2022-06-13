package util;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

    private Scanner scanner;

    public Input() {
        this.scanner = Scanner(System.in);
    }

    public String getString() {
        System.out.println("Please enter a string: ");
        String userInputStr = scanner.nextLine();
        return userInputStr;
    }

    public boolean yesNo() {
        System.out.println("The earth is flat?  Yes or no (y/n: ");
    String input = scanner.next();
    return input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.println("Please enter a string: ");
        int userInputInt = scanner.nextLine();

    }

    public int getInt() {
        String prompt "Please enter an integer between: " + min + " ane " + max;
            System.out.println((prompt));
        in user


}}

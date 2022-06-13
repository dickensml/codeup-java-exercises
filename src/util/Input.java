package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = Scanner(System.in);
    }

    public String getString() {
        System.out.println("Please enter a string: ");
        String userInput = scanner.nextLine();
        return userInput;
    }



}

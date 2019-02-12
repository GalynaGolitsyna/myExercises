package com.exercise;

import java.util.Scanner;

public class Controller {

    public static final String CORRECT_A = "world!";
    public static final String CORRECT_B = "Hello";

    private Model modelli;
    private View viewii;

    public Controller(Model modelli, View viewii) {
        this.modelli = modelli;
        this.viewii = viewii;
    }

    public void processingUser() {
        Scanner scan = new Scanner(System.in);
        modelli.setText(inputIntValueWithScanner(scan, View.INITIAL_HELLO, CORRECT_B));
        modelli.setText2(inputIntValueWithScanner(scan, View.INITIAL_WORLD, CORRECT_A));

    }


    private String inputIntValueWithScanner(Scanner scan, String firstGreeting, String correctResult) {
        viewii.printMessages(firstGreeting);
        while (scan.hasNext()) {
            String nextLine = scan.next();
            if (nextLine.equalsIgnoreCase(correctResult)) {
                return nextLine;
            }
            viewii.printMessages(View.WRONG_MESSAGE);
        }

        return scan.next();

    }


    public void message() {
        viewii.printGreeting(View.GREETING_IS, modelli.getText(), View.BACKSPACE, modelli.getText2());
    }
}


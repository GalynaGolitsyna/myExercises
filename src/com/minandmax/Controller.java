package com.minandmax;

import java.util.Scanner;

import static sun.nio.cs.Surrogate.MIN;

public class Controller {


    private static final int MAX = 99;
    public static final int MIN = 1;
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.generateSecretNumber(MIN, MAX);
        int answer = checkValueFromScanner(sc);

        while (!model.guessedNumber(answer)) {
            answer = checkValueFromScanner(sc);
        }

    }

    public int checkValueFromScanner(Scanner sc) {
        System.out.println(String.format(View.inputIntData, model.getMin(), model.getMax()));
        while (!sc.hasNextInt()) {
            System.out.println(String.format(View.NO_INPUT_INT_DATA + View.inputIntData, model.getMin(), model.getMax()));
            sc.next();
        }
        return sc.nextInt();
    }
}

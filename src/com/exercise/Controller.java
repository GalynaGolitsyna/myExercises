package com.exercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Controller {


    public static final String correctA = "world!";
    public static final String correct = "Hello";

    private Model modelli;
    private View viewii;

    public Controller(Model modelli, View viewii) {
        this.modelli = modelli;
        this.viewii = viewii;
    }

    public void processingUser() {
        Scanner scan = new Scanner(System.in);
        modelli.setText(inputIntValueWithScanner(scan));

    }

    public void processingUserS() {
        Scanner scanS = new Scanner(System.in);
        modelli.setText2(inputIntValueWithScannerW(scanS));

    }

    private String inputIntValueWithScanner(Scanner scan) {
        viewii.printMessages(View.INITIAL_HELLO);
        while(scan.hasNext()){
            String nextLine = scan.next();
            if(nextLine.equalsIgnoreCase(correct)) return nextLine;
            viewii.printMessages(View.WRONG_MESSAGE);
        }

        return scan.next();
    }

    private String inputIntValueWithScannerW(Scanner scanS) {
        viewii.printMessages(View.INITIAL_WORLD);
        while(scanS.hasNext()){
            String nextL = scanS.next();
            if(nextL.equalsIgnoreCase(correctA)) return nextL;
            viewii.printMessages(View.WRONG_MESSAGE);
        }
        return scanS.next();
    }
 public void message(){
        viewii.printGreeting(View.GREETING_IS, modelli.getText(), View.BACKSPACE, modelli.getText2());
 }
}


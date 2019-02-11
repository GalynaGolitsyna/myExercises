package com.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Model modelli = new Model();
        View viewii = new View();
        Controller controller = new Controller(modelli, viewii);
        controller.processingUser();
        controller.message();

    }

}


package com.exercise;

public class View {

    public static final String INITIAL_HELLO = "Please, enter: Hello:";
    public static final String INITIAL_WORLD = "Please enter: world!";
    public static final String WRONG_MESSAGE = "Please, enter correct message";
    public static final String GREETING_IS = "Greeting is ";
    public static final String BACKSPACE = " ";

    public void printGreeting(String message, String text, String messageM, String text2) {
        System.out.println(message + text + messageM + text2);
    }
    public void printMessages(String message) {
        System.out.println(message);
    }
}

package com.minandmax;

public class Model {



    public int min;
    public int max;
    int secretNumber;



    public void generateSecretNumber(int min, int max) {
        secretNumber = (int) (Math.random() * max + min);
        this.min = min;
        this.max = max;
   // System.out.println(secretNumber);

    }

    public boolean isCorrect(int n) {
        if (n == secretNumber) {
            return true;
        } else if (n < secretNumber && n > min) {
            min = n;
            return false;
        } else {
            max = n;
            return false;
        }
    }


    public boolean guessedNumber(int n) {
        if (isCorrect(n)) {
            return true;
        }
          if (n > min && n < secretNumber) {
            this.min = n;
            return false;
        } else if (n < max && n > secretNumber) {
            this.max = n;
            return false;
        } else {
            return false;
        }

    }
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}



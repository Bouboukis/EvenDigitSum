package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {

        for (int i = -25; i < 15; i++) {
            if (EvenDigitSum.getEvenDigitSum(i) < 0) {
                System.out.println("Invalid Value of " + i + ".");
            } else {
                System.out.println("The sum of even digits in the number " + i + " is: "
                        + EvenDigitSum.getEvenDigitSum(i));
            }
        }
    }
}

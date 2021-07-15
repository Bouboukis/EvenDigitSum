package com.georgioskachrimanis.javacourse;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int sum = 0, digit;

        if (number < 0) {
            return -1;
        }

        //Main Loop for numbers > 10.
        while (number > 10) {
            digit = number % 10;

           if((digit % 2) == 0){
               sum += digit;
           }
           number /= 10;
        }

        // When the number < 10.
        if (number % 2 == 0){
            sum += number;
        }

        return sum;

    }
}


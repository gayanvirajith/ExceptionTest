package com.execeptiontest;

import com.execeptiontest.exception.UnableToConvertStringToIntException;


/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void calc(int number) {
        try {
            int a = 2 / number;
        } catch (ArithmeticException e) {

        }
    }

    public static void convertStringToInt(String s) {
        try {
            int number = Integer.parseInt(s);
        } catch (NumberFormatException e) {
        }
    }

    public static int convertStringToIntReturn(String s)
            throws UnableToConvertStringToIntException {
        try {
            int number = Integer.parseInt(s);
            return number;
        } catch (NumberFormatException e) {
            throw new UnableToConvertStringToIntException("gayan");
        }
    }
}

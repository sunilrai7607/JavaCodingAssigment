package com.example.completable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Assignment3 {

    /**
     * Que3 - Please Write a java code inside the method 'getSumOfNumbers(String s)', Please implement this method to return the sum of all integers found in the parameter String. you can assume that integers are separated form other parts with one or more spaces('' symbols)
     * Output --
     * input                                        Output
     * ("20 30")                                        50
     * ("5 sad")                                         5
     * ("10 asgd 20 shd 30")                             60
     * (null)                                        Handle Exception
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        long sum = getSumOfNumbers(inputStr);
        System.out.println("Input String : " + inputStr);
        System.out.println("Sum : " + sum);
    }


    private static long getSumOfNumbers(String inputStr) {
        if (inputStr != null && !inputStr.trim().isEmpty()) {
            IntSummaryStatistics temp = Arrays.asList(inputStr.split(" "))
                    .stream()
                    .filter(inputValue -> isString(inputValue))
                    .map(Integer::parseInt)
                    .collect(Collectors.summarizingInt(Integer::intValue));
            return temp.getSum();
        }
        return 0;
    }

    private static boolean isString(String inputValue) {
        try {
            Integer.parseInt(inputValue);
            return true;
        } catch (NumberFormatException exception) {
            System.out.println("Exception : " + exception.getMessage());
        }

        return false;
    }

}

package com.example.completable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4 {
    /**
     * Que4 - Please Write a java code inside the method 'getRequiredNumberOfBits(int N)', Please implement this method to return the number of bits which is just enough to store any integers form 0 to N-1 inclusivly form any int N > 0
     * Output --
     * input      Output
     * 1           1
     * 16           5
     * 100         7
     * 5           3
     * 32          6
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer input = convertToInteger(br.readLine());
        System.out.println(" Input : " + input + " required size : " + getNumberOfBits(input));
        System.out.println(getNumberOfBits(input));

    }

    public static int getNumberOfBits(int N) {
        int bits = 0;
        while (Math.pow(2, bits) <= N) {
            bits++;
        }
        return bits;
    }


    private static Integer convertToInteger(String inputValue) {
        try {
            return Integer.parseInt(inputValue);
        } catch (NumberFormatException exception) {
            System.out.println("Exception : " + exception.getMessage());
            exception.printStackTrace();
        }
        return 0;
    }
}

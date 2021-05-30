package com.example.completable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment1 {
    /**
     * Que2 - Please write java code inside the method 'retainPositiveNumber(int[] a)', Please implement this method to retain a new array with only positive number from the given array. the elements in the resulting array shall be sorted in the ascending order.
     * Output -- input                           Output
     * {10,16,-16,18,-5,17} =====      {10,17,18,22}
     * @param args
     */

    public static void main(String[] args) {
        int[] input = {10, 16, -16, 18, -5, 17};
        retainPositiveNumber(input);
    }

    private static void retainPositiveNumber(int[] input) {
        List<Integer> inputArray = Arrays.stream(input).boxed().collect(Collectors.toList());
        List<Integer> outputArray = Arrays.stream(input).boxed().filter(intValue -> intValue > 0).collect(Collectors.toList());
        System.out.println("Input : " + inputArray);
        System.out.println("OutPut : " + outputArray);
    }
}

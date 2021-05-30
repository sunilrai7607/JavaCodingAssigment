package com.example.completable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Assignment2 {

    /**
     * Que1 - Please Write a java code inside the method 'CapitalizeFirstLetter(String s) Please implement this method to Capitalize all first letters of the word in the given String. all other symbols shall intact. if a word starts not with a letter, it shall  remain intact too. assume that the parameter String can only contain spaces and alphanumerics characters
     * Note - Please keep in mind that the words can we divided by single or multiple spaces. the spaces also can be found at beginning or the end of the parameter string and you need to preserve them
     * Output -- Input                      Output
     * {"hello world "}  --       Hello word
     * {"aditya pramod rao"} ---  Aditya Pramod Rao
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuffer sb = new StringBuffer();
        List<String> inputArray = Arrays.asList(input.split(" "));
        for (String inputValue : inputArray) {
            if (!inputValue.trim().isEmpty() && inputValue.trim().length() > 0) {
                sb.append(inputValue.substring(0, 1).toUpperCase() + inputValue.substring(1));
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}

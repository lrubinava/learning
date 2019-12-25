package com.Practice;

public class ReverseString {

    public static String reverseInPlace(String input) {
        StringBuilder inputBuild = new StringBuilder(input);

        for (int i = 0; i < inputBuild.length() / 2; i++) {
            char temp = inputBuild.charAt(i);
            int end = inputBuild.length() - i - 1;

            inputBuild.setCharAt(i, inputBuild.charAt(end));
            inputBuild.setCharAt(end, temp);
        }
        return inputBuild.toString();
    }

}

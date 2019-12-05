package com.Practice;

public class CovertIntToString {

    public static String convertIntToString(int n) {
        //positive numbers only
        String result = "";

        while (n > 0) {
            int reminder = n % 10;
            result = (char) ('0' + reminder) + result;
            n = n / 10;
        }
        return result;
    }

}

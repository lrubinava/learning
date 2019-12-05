package com.Practice;

public class Main {

    public static void main (String[] args) {
        //testConvertToString();
        //StopWords.removeStopWords("the car is blue", "the is are");


        String s = "";
        int n = 8;
        s += n;

        System.out.println(s);




    }

    public static void testConvertToString() {
        System.out.println(CovertIntToString.convertIntToString(1234));
    }

    public static void testCellCompete() {
        var cells = CellCompete.cellCompete(new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3);
        for(var elem: cells) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }



}

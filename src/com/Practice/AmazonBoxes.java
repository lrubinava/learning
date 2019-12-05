package com.Practice;

import java.util.*;
import java.util.ArrayList;

public class AmazonBoxes {
    public List<String> orderedJunctionBoxes(int numberOfBoxes, List<String> boxList) {
        ArrayList<String> newer = new ArrayList<>();
        ArrayList<String> older = new ArrayList<>();

        for (int i = 0; i < numberOfBoxes; i++) {
            String s = boxList.get(i);
            if (isNew(s)) {
                newer.add(s);
            } else {
                older.add(s);
            }
        }

        Collections.sort(older, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String id1 = a.substring( a.indexOf(" ") );
                String id2 = b.substring( b.indexOf(" ") );
                return id1.compareTo(id2);
            }
        });

        older.addAll(newer);
        return older;
    }

        public static boolean isNew(String box) {
            int index = box.indexOf(" ");
            for (int i = index; i < box.length(); i++) {
                if (box.charAt(i) >= '0' && box.charAt(i) <= '9') {
                    return true;
                }
            }
            return false;
        }
}

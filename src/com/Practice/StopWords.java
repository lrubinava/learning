package com.Practice;


import java.util.*;


public class StopWords {

    public static List<String> removeStopWords(String phrase, String stopWords) {
        List<String> result = new ArrayList<>();

        String phraseList[] = phrase.split(" ");

        Set<String> stopWordsSet = new HashSet<String>(Arrays.asList(stopWords.split(" ")));

//        StringTokenizer tokenizer = new StringTokenizer(stopWords," ");
//        while(tokenizer.hasMoreTokens()) {
//            stopWordsSet.add(tokenizer.nextToken());
//        }


        for(String word:phraseList) {
            if (!stopWordsSet.contains(word)) {
                result.add(word);
            }
        }

        result.stream().forEach(System.out::println);

        return result;
    }

}

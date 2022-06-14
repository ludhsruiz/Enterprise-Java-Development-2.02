package com.ironhack.maventest.main;

import java.util.ArrayList;
import java.util.List;

public class FindTextInLine {

    public void findTextInLine(String text) {

        List<String> tokens = new ArrayList<String>();
        tokens.add("123woods");
        tokens.add("woods");

        if (text.contains((CharSequence)tokens)) {
            System.out.println("Keyword matched the string");
        }
    }
}

//    String inputString = "hello there, Baeldung";//
//    String[] words = {"hello", "Baeldung"};


CONTAINS
//    public static boolean containsWords(String inputString, String[] items) {
//        boolean found = true;
//        for (String item : items) {
//            if (!inputString.contains(item)) {
//                found = false;
//                break;
//            }
//        }
//        return found;
//    }

//  INDEXOFF
//    public static boolean containsWordsIndexOf(String inputString, String[] words) {
//        boolean found = true;
//        for (String word : words) {
//            if (inputString.indexOf(word) == -1) {
//                found = false;
//                break;
//            }
//        }
//        return found;
//    }



package com.ironhack.maventest.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ReturnArrayOfOdds newArrayList = new ReturnArrayOfOdds();
        List<Integer> arrList = newArrayList.returnArrayOfOdds(10);
        System.out.println(arrList);

        findText("I will come and meet you at the 123woods");

    }

    private static boolean findText(String s) {

        List<String> tokens = new ArrayList<String>();
        tokens.add("123woods");
        tokens.add("woods");

        String[] sentence = s.split(s);
        for(String word: sentence)
        {
            if(word.equals(tokens))
                return true;
        }
        return false;

    }

}

//
//    I. Employing TDD, create a method that takes in an integer n and returns an array of all odd integers from 1 to n.
//    Write your tests first!
//    II. Employing TDD, create a method that takes in a String and returns true if the String contains any Java Keywords.
//    ex. "Don't -break- my heart" should return true. The String "I love to
//    breakdance" should return false.


//    String keywords[] = { "abstract", "assert", "boolean",
//            "break", "byte", "case", "catch", "char", "class", "const",
//            "continue", "default", "do", "double", "else", "extends", "false",
//            "final", "finally", "float", "for", "goto", "if", "implements",
//            "import", "instanceof", "int", "interface", "long", "native",
//            "new", "null", "package", "private", "protected", "public",
//            "return", "short", "static", "strictfp", "super", "switch",
//            "synchronized", "this", "throw", "throws", "transient", "true",
//            "try", "void", "volatile", "while" }
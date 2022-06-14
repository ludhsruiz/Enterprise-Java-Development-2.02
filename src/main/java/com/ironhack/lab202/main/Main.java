package com.ironhack.lab202.main;


import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        oddArray(11);

        String phrase = "do not go breaking my heart";
        System.out.println(checkKeyWordsInString(phrase));
    }

    public static int[] oddArray(int n) {
        if (n < 0) {
            return new int[]{};
        }
        int[] oddArray;
        if (n % 2 == 1) {
            oddArray = new int[(n / 2) + 1];
        } else {
            oddArray = new int[n / 2];
        }
        int oddCount = 1;
        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = oddCount;
            oddCount += 2;
        }
        return oddArray;
    }


    public static Boolean checkKeyWordsInString(String string) {
        Boolean haveKeywords = false;
        String[] keyWordList = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
                "class", "continue", "const", "default", "do", "double", "else", "enum", "exports", "extends",
                "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
                "interface", "long", "module", "native", "new", "package", "private", "protected", "public",
                "requires", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "var", "void", "volatile", "while"};
        String[] stringSplitted = string.split(" ");
        for (int i = 0; i < stringSplitted.length; i++) {
            for (int j = 0; j < keyWordList.length; j++) {
                if (stringSplitted[i].equals(keyWordList[j])) {
                    haveKeywords = true;
                }
            }
        }
        return haveKeywords;
    }



}

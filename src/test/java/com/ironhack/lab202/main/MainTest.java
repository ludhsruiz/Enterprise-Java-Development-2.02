package com.ironhack.lab202.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static Main main;

    @Test
    void oddArray_positiveEven_array() {
        assertArrayEquals(new int[]{1, 3, 5}, main.oddArray(5));
        assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17}, main.oddArray(17));
        assertArrayEquals(new int[]{1}, main.oddArray(1));
    }

    @Test
    void oddArray_positiveOdd_array() {
        assertArrayEquals(new int[]{1, 3, 5}, main.oddArray(6));
        assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17}, main.oddArray(18));
        assertArrayEquals(new int[]{1}, main.oddArray(2));
    }

    @Test
    void oddArray_zero_emptyArray() {
        assertArrayEquals(new int[]{}, main.oddArray(0));
    }

    @Test
    void oddArray_negativeValue_emptyArray() {
        assertArrayEquals(new int[]{}, main.oddArray(-3));
        assertArrayEquals(new int[]{}, main.oddArray(-17));
    }

    @Test
    void findIfContainsKeywords_stringWithKeywordAsWord_true() {
        assertEquals(true, main.checkKeyWordsInString("Don't break my heart"));
        assertEquals(true, main.checkKeyWordsInString("Don't return break my heart"));
        assertEquals(true, main.checkKeyWordsInString("for"));
    }

    @Test
    void findIfContainsKeywords_stringWithKeywordAsPartOfWord_false() {
        assertEquals(false, main.checkKeyWordsInString("Don't breakmy heart"));
        assertEquals(false, main.checkKeyWordsInString("Don't returnbreak my heart"));
    }

    @Test
    void findIfContainsKeywords_emptyString_false() {
        assertEquals(false, main.checkKeyWordsInString(""));
    }

    @Test
    void findIfContainsKeywords_spaceString_false() {
        assertEquals(false, main.checkKeyWordsInString(" "));
    }

    @Test
    void findIfContainsKeywords_moreThanOneSpacesBetweenWords_true() {
        assertEquals(true, main.checkKeyWordsInString("  Don't    break my heart"));
    }
}
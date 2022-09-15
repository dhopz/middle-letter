package com.example.test;

import com.example.main.MiddleLetter;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleLetterTest {

    @Test
    public void middleTextStringLengthOfWordIsEvenReturn2Letters() {
        MiddleLetter word = new MiddleLetter("test");
        assertEquals("es",word.middleText());
    }

    @Test
    public void middleTextStringLengthOfWordIsNotEvenReturnOneLetter(){
        MiddleLetter word = new MiddleLetter("testing");
        assertEquals("t",word.middleText());
    }

    @Test
    public void middleTextStringLengthOfWordIsOneReturnLetter(){
        MiddleLetter word = new MiddleLetter("A");
        assertEquals("A", word.middleText());
    }

    @Test
    public void middleTextStringLengthOfWordIsTwoReturnTwo(){
        MiddleLetter word = new MiddleLetter("of");
        assertEquals("of",word.middleText());
    }

    @Test
    public void middleTextStringWordContainsNumberReturnStringTwoCharacters(){
        MiddleLetter word = new MiddleLetter("123456");
        assertEquals("34",word.middleText());
    }

    @Test
    public void middleTextStringSymbolsReturnSingleCharacter(){
        MiddleLetter word = new MiddleLetter("&");
        assertEquals("&",word.middleText());
    }

}

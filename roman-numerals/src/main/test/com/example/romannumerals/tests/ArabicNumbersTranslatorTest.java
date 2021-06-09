package com.example.romannumerals.tests;

import com.example.romannumerals.ArabicNumbersTranslator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class ArabicNumbersTranslatorTest {

    private ArabicNumbersTranslator arabicNumbersTranslator = new ArabicNumbersTranslator();

    @Test
    void oneIsI(){
        assertThat(arabicNumbersTranslator.roman(1), is("I"));
    }

    @Test
    void twoIsII(){
        assertThat(arabicNumbersTranslator.roman(2), is("II"));
    }

    @Test
    void threeIsIII(){
        assertThat(arabicNumbersTranslator.roman(3), is("III"));
    }

    @Test
    void fourIsIV(){
        assertThat(arabicNumbersTranslator.roman(4), is("IV"));
    }

    @Test
    void fiveIsV(){
        assertThat(arabicNumbersTranslator.roman(5), is("V"));
    }
}

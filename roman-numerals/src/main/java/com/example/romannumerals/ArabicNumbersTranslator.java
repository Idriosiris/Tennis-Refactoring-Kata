package com.example.romannumerals;

import java.util.HashMap;

public class ArabicNumbersTranslator {

    private final HashMap<Integer, String> romanNumbersMap;

    public ArabicNumbersTranslator() {
        romanNumbersMap = new HashMap<>();

        romanNumbersMap.put(1, "I");
    }

    public String roman(int arabicNumber) {
        String romanNumber = constructRomanNumber(arabicNumber);

        return romanNumber;
    }

    private String constructRomanNumber(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();

        while(arabicNumber != 0) {
            romanNumber.append(romanNumbersMap.get(1));

            arabicNumber--;
        }

        return romanNumber.toString();
    }
}

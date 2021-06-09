package com.example.romannumerals;

import java.util.HashMap;

public class ArabicNumbersTranslator {

    private final HashMap<Integer, String> romanNumbersMap;

    public ArabicNumbersTranslator() {
        romanNumbersMap = new HashMap<>();

        romanNumbersMap.put(1, "I");
    }

    String roman(int arabicNumber) {
        String romanNumber = "";

        while(arabicNumber != 0) {
            romanNumber += romanNumbersMap.get(1);

            arabicNumber--;
        }

        return romanNumber;
    }
}

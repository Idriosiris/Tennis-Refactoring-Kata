package com.example.romannumerals;

import java.util.HashMap;

public class ArabicNumbersTranslator {

    private final HashMap<Integer, String> romanNumbersMap;

    public ArabicNumbersTranslator() {
        romanNumbersMap = new HashMap<>();

        romanNumbersMap.put(1, "I");
    }

    String roman(int arabicNumber) {
        if(arabicNumber == 1)
            return romanNumbersMap.get(1);

        if(arabicNumber == 2)
            return romanNumbersMap.get(1) + romanNumbersMap.get(1);

        return null;
    }
}

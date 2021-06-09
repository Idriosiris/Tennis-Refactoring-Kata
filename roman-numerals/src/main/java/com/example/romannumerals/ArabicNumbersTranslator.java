package com.example.romannumerals;

import java.util.HashMap;

public class ArabicNumbersTranslator {

    private final HashMap<Integer, String> romanNumbersMap;

    public ArabicNumbersTranslator() {
        romanNumbersMap = new HashMap<>();

        romanNumbersMap.put(1, "I");
    }

    String roman(int i) {
        if(i == 1)
            return getI(1);

        if(i == 2)
            return getI(1) + getI(1);

        return null;
    }

    private String getI(int i) {
        return romanNumbersMap.get(i);
    }
}

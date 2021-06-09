package com.example.romannumerals;

import java.util.HashMap;
import java.util.Stack;

public class ArabicNumbersTranslator {

    private final HashMap<Integer, String> romanNumbersMap;

    public ArabicNumbersTranslator() {
        romanNumbersMap = new HashMap<>();

        romanNumbersMap.put(1, "I");
        romanNumbersMap.put(5, "V");
    }

    public String roman(int arabicNumber) {
        if (arabicNumber == 1) {
            return romanNumbersMap.get(1);
        } else if(arabicNumber == 2){
            return romanNumbersMap.get(1) + romanNumbersMap.get(1);
        }else if(arabicNumber == 3){
            return romanNumbersMap.get(1) + romanNumbersMap.get(1) + romanNumbersMap.get(1);
        }

        return null;
    }

}

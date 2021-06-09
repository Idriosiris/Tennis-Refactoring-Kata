package com.example.romannumerals;

public class ArabicNumbersTranslator {
    String roman(int i) {
        if(i == 1)
            return "I";

        if(i == 2)
            return "II";

        return null;
    }
}

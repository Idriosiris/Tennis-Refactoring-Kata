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
        Stack<String> romanNumberStack = new Stack<>();

        while(arabicNumber != 0) {
            if(arabicNumber >= 4 && arabicNumber <= 5 ) {
                romanNumberStack.push(romanNumbersMap.get(5));

                if( arabicNumber == 5 )
                    arabicNumber = 5 - 5;
                else
                    arabicNumber = 5 - 4;

            } else if(arabicNumber <= 3){
                romanNumberStack.push(romanNumbersMap.get(1));

                arabicNumber = arabicNumber - 1;
            }
        }

        return toRomanNumber(romanNumberStack);
    }

    private String toRomanNumber(Stack romanNumberStack) {
        StringBuilder romanNumber = new StringBuilder();

        while(!romanNumberStack.empty()) {
            romanNumber.append(romanNumberStack.pop());
        }

        return romanNumber.toString();
    }

}

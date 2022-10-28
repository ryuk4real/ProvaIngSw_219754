package org.example;

public class FunnyAlgorithms {

    public static int stringToIntConverter(String str) throws RuntimeException{

        int number;

        for (int i = 0; i < str.length(); ++i)
        {
            char c = str.charAt(i);

            if (c != '-' && !Character.isDigit(c)) throw new IllegalArgumentException("String must not contain characters different than digis.");
        }

        number = Integer.parseInt(str);

        if (number < -32768 || number > 32767) {
            throw new IllegalArgumentException("Number must be in range [-32768, 32767]");
        }

        return number;
    }
}

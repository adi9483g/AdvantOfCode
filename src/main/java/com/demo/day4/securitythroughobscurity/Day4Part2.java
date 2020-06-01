package com.demo.day4.securitythroughobscurity;

import java.util.List;
public class Day4Part2 {
    public static int getBlock(List<String> input) {

        int result = 0;
        for (String data : input) {
            char[] characters = data.toCharArray();
            int i = 0;
            for (char ch : characters) {
                if (ch >= '0' && ch <= '9') { break; }
                i++;
            }

            int x = i;
            int temp = 0;
            for (; i < characters.length; i++) {
                if (characters[i] == '[') { break; }
                temp = 10 * temp + (characters[i] - '0');
            }
            for (i = 0; i < x; i++) {
                if (characters[i] == '-') {
                    continue;
                }
                characters[i] = (char) ('a' + ((((int) characters[i] - 'a') + temp) % ('z' - 'a' + 1)));
            }

            String str = new String(characters);
            if (str.indexOf("northpole") != -1) {
                result = temp;
                break;
            }
        }
        return result;
    }
}

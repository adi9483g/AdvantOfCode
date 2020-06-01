package com.demo.day4.securitythroughobscurity;

import java.util.Arrays;
import java.util.List;

public class Day4Part1 {

    public static int getSectorId(List<String> input) {
        int result = 0;
        Character[] characters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        for (String string : input) {
            int[] array = new int[characters.length];
            int i = 0;
            for (; i < string.length(); i++) {
                char temp = string.charAt(i);
                if (temp == '-') {
                    continue;
                } else if (temp >= '0' && temp <= '9') { break; }
                array[temp - 'a']++;
            }

            int x = 0;
            for (; i < string.length(); i++) {
                char c = string.charAt(i);
                if (c == '[') { break; }
                x = 10 * x + (c - '0');
            }

            String checksum = string.substring(i+1, string.length()-1);
            Arrays.sort(characters, (a, b) -> {
                if (array[b - 'a'] == array[a - 'a']) {
                    return a - b;
                }
                return array[b - 'a'] - array[a - 'a'];
            });

            boolean check = true;
            for (int j = 0; j < checksum.length(); j++) {
                check &= (checksum.charAt(j) == characters[j]);
            }
            if (check) {
                result += x;
            }
        }
        return result;
    }

}

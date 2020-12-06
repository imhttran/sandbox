package com.ttran.practice.utils;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveString {

    public static String removeDuplicateChars(String s) {
        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }

        String result = "";
        for (Character ch : charSet) {
            result += ch;
        }

        return result;
    }


    public static String removeDuplicate(String s) {

        char[] c = s.toCharArray();

        Set<Character> set = new LinkedHashSet<>();
        for(Character x: c){
            set.add(x);
        }
        StringBuilder sb = new StringBuilder();
        for(Character z: set){
            sb.append(z);
        }
        return sb.toString();

    }


    public static String removeCharsFromString(String str, String rm) {

        char[] input1char = str.toCharArray();
        StringBuffer output = new StringBuffer();

        for (int i = 0; i < input1char.length; i++) {
            String value = String.valueOf(input1char[i]);

            if (!rm.contains(value)) {
                output.append(value);
            }
        }
        return output.toString();
    }
}

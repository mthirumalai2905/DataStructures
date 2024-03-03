package Strings;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] testStrings1 = {"flower", "flow", "flight"};
        String[] testStrings2 = {"dog", "racecar", "car"};

        System.out.println("Longest common prefix for testStrings1: " + longestCommonPrefix(testStrings1)); // Expected output: "fl"
        System.out.println("Longest common prefix for testStrings2: " + longestCommonPrefix(testStrings2)); // Expected output: ""
    }

    private static String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length - 1];
        int i = 0;
        int j = 0;

        while (i < start.length() && j < end.length()) {
            if (start.charAt(i) == end.charAt(j)) {
                i++;
                j++;
            } else {
                break;
            }
        }

        return start.substring(0, i);
    }
}

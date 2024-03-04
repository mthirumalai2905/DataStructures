package Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        // Initialize variables
        int maxLength = 0; // Length of the longest substring without repeating characters
        int i = 0, j = 0; // Pointers to represent the start and end of the current substring
        HashSet<Character> set = new HashSet<>(); // HashSet to store unique characters in the current substring

        // Iterate through the string using the 'j' pointer
        while (j < s.length()) {
            // If the character at 'j' is not present in the set
            if (!set.contains(s.charAt(j))) {
                // Add the character to the set, move 'j' forward, and update maxLength
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, set.size());
            } else {
                // If the character is already present, remove the character at 'i', move 'i' forward
                set.remove(s.charAt(i++));
            }
        }

        // Return the length of the longest substring without repeating characters
        return maxLength;
    }

    public static void main(String[] args) {
        // Test the function with an example input
        String input = "abcabcbbdef";
        int output = lengthOfLongestSubstring(input);

        // Print the result
        System.out.println("The Longest Substring length is: " + output);
    }
}

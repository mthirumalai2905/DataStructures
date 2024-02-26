package Strings;

public class Reverse {

    public static String reverseString(String input){
        // Split the input string into words
        String[] words = input.split("\\s+"); // Split by whitespace

        // Initialize a StringBuilder to store the reversed words
        StringBuilder reversed = new StringBuilder();

        // Append words in reverse order to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Append space between words, except for the last word
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World";
        String output = reverseString(input);

        System.out.print("The reverse of the string hence is:- " + output);
    }

}

package Strings;

public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        // Check if the lengths of the strings are equal and not empty
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        // Concatenate s1 with itself
        String concatenated = s1 + s1;

        // Check if s2 is a substring of the concatenated string
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        String s3 = "hello";
        String s4 = "";

        // Test the isRotation function
        System.out.println("Is \"" + s2 + "\" a rotation of \"" + s1 + "\": " + isRotation(s1, s2));
        System.out.println("Is \"" + s3 + "\" a rotation of \"" + s1 + "\": " + isRotation(s1, s3));
        System.out.println("Is \"" + s4 + "\" a rotation of \"" + s1 + "\": " + isRotation(s1, s4));

    }
}

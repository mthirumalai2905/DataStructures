package Strings;

public class Palindrome {

    public static boolean palindromeChecker(String input){
        int left = 0;
        int right  = input.length() - 1;


        while(left < right){
            if(input.charAt(left) == input.charAt(right)){
                return true;
            }

            left++;
            right--;
        }
        return false;
    }
    public static void main(String[] args){
        String input = "anna";
        boolean res = palindromeChecker(input);

        System.out.print("Hence the Following input is Palindrome: "+ res);

    }
}

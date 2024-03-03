package Strings;

public class CountTheNumberOfVowels {
    public static void main(String[] args){
        String input = "bitchassnigga";
        int output = countVowel(input);
        System.out.print("The total count of vowel is"+ output);
    }

    private static int countVowel(String input) {
             int vowels = 0;
             for(int i=0; i<input.length(); i++){
                char ch = input.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                    vowels++;
                }

             }

             return vowels;
            }
}

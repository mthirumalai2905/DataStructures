package Strings;

import java.util.Arrays;

public class Anagram {
    
     public boolean isAnagram(String s, String t) {
         if(s == null || t == null || s.length() != t.length()){
            return false;
        }

        s=s.toLowerCase();
        t=t.toLowerCase();

        char[] array = s.toCharArray();
        char[] array1 = t.toCharArray();

        Arrays.sort(array);
        Arrays.sort(array1);


        
        return Arrays.equals(array, array1); 
        }
}

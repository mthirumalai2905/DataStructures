package Strings;

import java.util.HashMap;

public class StringCompression {
    private static void compressed(String input){

        char[] arr = input.toCharArray();
     
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : arr){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }


        StringBuilder sb = new StringBuilder();
        for(HashMap.Entry<Character, Integer> entry : map.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }

        System.out.print(sb.toString());
    }
    public static void main(String[] args){
        String input = "aabbccdgef";
        compressed(input);

    }
}

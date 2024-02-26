package Arrays;

import java.util.HashMap;

public class frequencyArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,2,1,1,2,2};
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : array){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("Element: "+entry.getKey()+ ", Frequency: "+ entry.getValue());
        }
    }
    
}

import java.util.*;

public class UniqueSubarrays {
    public static void findUniqueSubarrays(int[] arr) {
        arr.toString();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr.toString.substring(i,j));
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3};
        findUniqueSubarrays(arr);
    }
}

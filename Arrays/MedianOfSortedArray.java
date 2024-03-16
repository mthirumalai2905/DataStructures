import java.util.Arrays;

public class MedianOfSortedArray {
    public static void main(String[] args) {
    //    System.out.print(3.0/1.5);

    //    System.out.print( (double) 3 / (double) 1.5);

    int[] arr1 = {1,2,3};
    int[] arr2 = {4,5};

    int[] res = new int[arr1.length + arr2.length];

    int k = 0;
    for(int i=0; i<arr1.length; i++){
        res[k++] = arr1[i];
    }

    for(int j =0; j<arr2.length; j++){
        res[k++] = arr2[j];
    }

   
    for(int z = 0; z < res.length; z++){
        if(z == 0){
        System.out.print("[");
        }
        System.out.print( res[z] + ",");
        if(z == res.length-1){
        System.out.print("]");
        }
    }


     }
}

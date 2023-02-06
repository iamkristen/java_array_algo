package array_algo;

import java.util.Arrays;

public class ReverseArray {

    static int[] reverse(int[] arr){
        int[] result =new int[arr.length] ;
        for(int i=0; i<arr.length; i++){
            result[i] = arr.length-i;
        }
        return result;
    }


    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        Arrays.stream(reverse(array)).forEach(System.out::println);
        
    }
    
}



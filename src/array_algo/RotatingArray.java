package array_algo;

import java.util.Arrays;

public class RotatingArray {

    static void rotatingArrayLeft(int[] arr){
        // int[] result = new int[arr.length];
        int first = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }

    static void rotatingArrayRight(int[] arr){
        int last = arr[arr.length-1];
        for(int i = arr.length-1; i>0; i--){
            arr[i]= arr[i-1];
        }
        arr[0]=last;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        // rotatingArrayLeft(arr);
        rotatingArrayRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    
}

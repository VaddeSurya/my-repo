package Tcs.Array;

// sort the array in inc dex part

import java.lang.reflect.Array;

// input arr = {1, 5, 3, 8, 7, 10, 2}
//Sorted Array: {1, 2, 3, 5, 7, 8, 10}

// increasing and decrasing both 

public class IncDec {

    public static void sortInInc(int arr[]){
        Arrays.sort(arr);
        System.out.println("Sorted Array in Increasing Order: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }   
    }
    public static void main(String[] args) {
       int arr[] = {1, 5, 3, 8, 7, 10, 2};
         sortInInc(arr);
}
}


//this array has been sorted in increasing order
/
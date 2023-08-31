package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubblesort(int[]arr){
        int n = arr.length;
        boolean swapped = false;
//        run the steps n-1 times
        for(int i=0;i<n;i++){
            swapped = false;
//            for each step last item will come at last respective index
            for (int j = 1; j < n-i; j++) {
//                swap if the item  is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            if you did not swap for a particular value of i, it meams the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,100,5,6};
        bubblesort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

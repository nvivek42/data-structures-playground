package Arrayss;

import java.util.Arrays;

public class reverseElem {
    public static void reverseElements(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr =new int[] {1,2,3,4,5,6,7};
        reverseElements(arr);
    }
}

package Arrayss;

import java.util.Arrays;

public class moveAllZeroes {
    static void moveAllZeroes1(int[] arr){
        //create a new array of same length--put all non zero no here
        //Arrays.sort(arr);
        int j=0;
        int[] arr1 =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]!=0){
                arr1[j]=arr[i];
                j++;
            }
                       
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        moveAllZeroes1(new int[]{1,2,3,0,0,5,4,8,0,9});
    }
}

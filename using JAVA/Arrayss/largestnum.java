package Arrayss;

import java.util.Arrays;


public class largestnum {
    public static int largestNumber(int[] arr){
        StringBuilder sb =new StringBuilder();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){

            sb.append(arr[i]);
        }

        String s = new String(sb);
        int num = Integer.parseInt(s);
        return num;
        /*
         * compare ith elem with i+1
         * whichever is the largest, store it in largest elem
         */
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,55,4,0};
        System.out.println(largestNumber(arr));
    }
}

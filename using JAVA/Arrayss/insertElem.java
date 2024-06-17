package Arrayss;

import java.util.Arrays;

public class insertElem {
    public static void insertElement(int[] arr,int elem,int pos){
        int[] result = new int[arr.length+1];
        for(int i=0;i<pos-1;i++){
            result[i] = arr[i];
        }
        result[pos-1]=elem;
        int k = pos-1;
        for(int j=pos;j<result.length;j++){
            
            result[j]=arr[k];
            k++;
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        insertElement(new int[]{1,2,4,5,6}, 3, 3);
    }
}

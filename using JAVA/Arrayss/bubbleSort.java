package Arrayss;

public class bubbleSort {
     public static int[] bubblySort(int[] arr){
        int n= arr.length-1;
      for(int i=0;i<n;i++){
        for(int j=0;j<n-1-i;j++){//improved bubble sort
            if(arr[j]>arr[j+1])
                swap(arr[j],arr[j+1]);
        }
    }
        return arr;
     }
   
    private static void swap(int i, int j) {
        int temp =  i;
        i = j;
        j = temp;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{6,4,3,2,1,0};
        bubblySort(arr);
        for(int i:arr)
            System.out.print(i+",");
        
    }

}

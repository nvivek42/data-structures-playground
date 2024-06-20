package Arrayss;

import java.util.Arrays;
import java.util.PriorityQueue;

public class maxStock {
    
    public static int maxProfit(int[] prices) {
        //store arr[i+1]-arr[i] in a hashmap //if max of all these values is -ve return zero
        //traverse till arr.length-1
        //use two ptrs -->j=i+1 ==>  Math.Max(max,arr[i+1]-arr[i])

    //     int max=-1;
    //     for(int i=0;i<prices.length-1;i++){
    //         for(int j=i+1;j<prices.length;j++){
    //             max= Math.max(max, prices[j]-prices[i]);
    //         }
    //     }
    //     if(max<0)
    //         return 0;
    //     return max;
               
       //max profit on stocks [2,8,4,1]
        //as u hv to comapre in frwd dir only n that too each elem with rest of elems
        //u hv to compare max in each pass n sub pass n set max accordingly
        //if max<0 return zero.
        // int max=-1;
        // for(int i=0;i<prices.length-1;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]>prices[i]){
        //             // max = Math.Max(max,prices[j]-prices[i]);
        //             if(max < prices[j]-prices[i])
        //                 max = prices[j]-prices[i];
        //         }
        //     }
        // }
        // if(max<0)
        //     return 0;
        // else return max;
        }
      
    //find max n min from given array also find their index 
    //if index of max>index of min ==>return max-min
    //else check 2nd max 
    
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}


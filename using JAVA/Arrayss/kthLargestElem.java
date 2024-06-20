import java.util.HashSet;
import java.util.PriorityQueue;

public class kthLargestElem {
    public static int Kth_Largest_Element(int[] nums, int k){
        PriorityQueue<Integer> q =new PriorityQueue<Integer>(k);
   //     HashSet<Integer> hs = new HashSet<>();
   //     for (int i:nums) {
   //         hs.add(i);
            // q.offer(i);

            // if(q.size()>k)
            //     q.poll();
            
   //     }
        for(int j:nums){
            q.offer(j);

            if(q.size()>k)
                q.poll();
        }
        return q.peek();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,6};
        int k=Kth_Largest_Element(nums, 3);
        System.out.println("kth largest elem: "+k);
    }
}

package Winner;
import java.util.*;
class Solution5 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(nums.length);
        for (int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        for (int i=0;i<nums.length;i++)
        {
            nums[i]=pq.remove();
        }
        return nums[nums.length-k];
    }
}
public class KthLargestEle {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k= 2;
        Solution5 obj=new Solution5();
        System.out.println(obj.findKthLargest(nums,k));
    }
}

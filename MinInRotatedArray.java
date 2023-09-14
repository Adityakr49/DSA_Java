package Winner;
class Sol9 {
    public int findMin(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        int low=0,high=nums.length-1,mid=0;
        while (low<=high)
        {
            mid=(low+high)/2;
            if(mid>0&&nums[mid]<nums[mid-1])
            {
                return nums[mid];
            }
            else if(nums[mid]>=nums[low] && nums[mid]>nums[high])
            {
                low=mid+1;
            }
            else
            {
                high=mid -1;
            }
        }
        return nums[mid];
    }
}
public class MinInRotatedArray {
    public static void main(String[] args) {
    }
}

package Winner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution9
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> obj=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i-1] != nums[i]))
            {
                int lo = i + 1, high = nums.length - 1, sum = 0 - nums[i];
                while (lo < high)
                {
                    if (nums[lo] + nums[high] == sum)
                    {
                        obj.add(Arrays.asList(nums[i], nums[lo], nums[high]));
                        while (lo < high && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < high && nums[high] == nums[high - 1]) high--;
                        lo++;
                        high--;
                    }
                    else if (nums[lo] + nums[high] < sum) lo++;
                    else high--;
                }
            }
        }
        return obj;
    }
}
public class S3um {
    public static void main(String[] args) {
        Solution9 obj=new Solution9();
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(nums));
    }
}

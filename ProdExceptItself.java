package Winner;
class Sol7 {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prod=new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=1;
        right[n-1]=1;
        for (int i=1;i<n;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        for (int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*nums[i+1];
        }
        for (int i=0;i<n;i++)
        {
            prod[i]=left[i]*right[i];
        }
        return prod;
    }
}
public class ProdExceptItself {
    public static void main(String[] args) {
        Sol7 obj=new Sol7();
        int[] nums={1,2,3,4};
        int[] ans=obj.productExceptSelf(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

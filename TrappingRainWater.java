package Winner;
class Sol6 {
    public int trap(int[] height) {
        int n=height.length;
        int units=0;
        Integer left[]=new Integer[n];
        Integer right[]=new Integer[n];
        left[0]=height[0];
        right[n-1]=height[n-1];
        for (int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<n;i++)
        {
            units=units+Math.min(left[i],right[i])-height[i];
        }
        return units;
    }
}
public class TrappingRainWater {
    public static void main(String[] args) {
        Sol6 obj=new Sol6();
        int[] arr={4,2,0,3,2,5};
        System.out.println(obj.trap(arr));
    }
}

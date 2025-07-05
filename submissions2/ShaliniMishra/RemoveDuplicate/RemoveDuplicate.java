import java.util.*;
class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
     int i=0;
    for(int j=1;j<nums.length;j++)
    {
     if(nums[j] != nums[i])
     {
        i++;
    nums[i]=nums[j];
     }
    }
    return i+1;
    }
    public static void msin(String args[])
    {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int k=removeDuplicates(nums);
        System.out.println("k="+k);
        System.out.println("Modified array");
        for(int i=0;i<k;i++)
        {
          System.out.println(nums[i]+"");
    }
    }
}
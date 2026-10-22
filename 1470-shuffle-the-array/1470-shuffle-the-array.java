class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int t=0;
        for(int i=0;i<nums.length&&t<n;i=i+2){
            ans[i]=nums[t];
            t++;
        }
        for(int j=1;j<nums.length;j=j+2){
            ans[j]=nums[n];
            n++;
        }
        return ans;
    }
}
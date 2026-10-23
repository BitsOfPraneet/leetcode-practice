class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int x:nums){
            int digit=0;
            while(x>0){
                x=x/10;
                digit++;
            }
            if(digit%2==0) count++;
        }
        return count;
    }
}
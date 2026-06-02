class Solution {
    public int maxSubArray(int[] nums) {
        int cursubsum = nums[0];
        int maxsubsum = nums[0];

        for(int i=1; i<nums.length; i++){
            cursubsum = Math.max(cursubsum+nums[i] , nums[i]);
            if(cursubsum > maxsubsum){
                maxsubsum = cursubsum;
            }
        }
        return maxsubsum;
    }
}

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Compute the sum of the first window of size k
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        double maxSum = currentSum;
        
        // Slide the window across the remaining elements of the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        // Return the maximum average
        return maxSum / k;
    }
}
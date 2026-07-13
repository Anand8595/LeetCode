class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
            }else if(nums[i]>smax){
                smax=nums[i];
            }
        }
        int sum = (max-1) * (smax-1);
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
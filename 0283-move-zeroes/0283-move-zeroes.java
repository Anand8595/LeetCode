class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        while(j<n){
            if(nums[i]!=0 && nums[j]!=0){
                i++;
                j++;
            }else if(nums[i]==0 && nums[j]==0){
                j++;
            }else if(nums[i]==0 && nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
            }else if(nums[i]!=0 && nums[j]==0){
                i++;
                j++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
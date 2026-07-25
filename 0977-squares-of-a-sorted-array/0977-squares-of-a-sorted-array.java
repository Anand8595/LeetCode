class Solution {
    public int[] sortedSquares(int[] nums) {

       int[] ans = new int[nums.length];
       int initialS = 0;
       int endS = nums.length-1;
       int ptr = ans.length-1;

       while(initialS<=endS){
        int ss = nums[initialS] * nums[initialS];
        int es = nums[endS] * nums[endS];
        if(ss>es){
            ans[ptr] = ss;
            initialS++;
        }else{
            ans[ptr] = es;
            endS--;
        }
        ptr--;
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
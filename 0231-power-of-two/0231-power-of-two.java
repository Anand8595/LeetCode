class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }if(n==1){
            return true;
        }else{
            return false;
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
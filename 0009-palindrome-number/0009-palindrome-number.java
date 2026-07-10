class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n = x;
        int revNum = 0;
        while(n>0){
            int d = n%10;
            revNum = revNum*10+d;
            n = n/10;
        }
        if(revNum == x){
            return true;
        }else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
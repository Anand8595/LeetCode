class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int firstTerm = 0;
        int secondTerm = 1;

        for(int i=0; i<n; i++){
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        return firstTerm;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
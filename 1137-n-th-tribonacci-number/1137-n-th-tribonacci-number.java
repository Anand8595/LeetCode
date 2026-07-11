class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 1;
        
        for(int i=0; i<n; i++){
            int forthTerm = firstTerm + secondTerm + thirdTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = forthTerm;
        }
        return firstTerm;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
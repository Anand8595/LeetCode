class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = digits.length;
        int carry =1;
        for(int i=n-1; i>=0; i--){
            if(digits[i]+carry<=9){
                ans.add(digits[i]+carry);
                carry = 0;
            }else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry==1){
            ans.add(1);
        }
        // Collections.reverse(ans);
        int[] fnl = new int[ans.size()];
        for(int i=0; i<fnl.length; i++){
            fnl[i]=ans.get(ans.size() - 1 - i);
        }
        return fnl;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
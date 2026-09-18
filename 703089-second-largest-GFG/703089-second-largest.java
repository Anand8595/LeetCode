class Solution {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                int temp = max;
                max = arr[i];
                smax= temp;
            }else if(arr[i]<max && arr[i]>smax){
                smax=arr[i];
            }
        } 
        
        if (smax == Integer.MIN_VALUE) {
            return -1;
        }
        return smax;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
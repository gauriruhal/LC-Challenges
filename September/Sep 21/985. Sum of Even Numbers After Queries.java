class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        // For Storing Sum
        int sum = 0;
        
        // Calculating The Sum Of Even Elements In Nums Array
        for (int num: nums){
            
            // Checking For Even Elements
            if (num % 2 == 0){
                
                // Adding It To The Sum
                sum += num;
            }
            
        }         
        // For storing the results 
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            
            // Taking Value and index and queries 
            int val = queries[i][0];
            int index = queries[i][1];
            
            // If Current Element In Index index Of Nums Is Even Then We Subtract The Element
            if (nums[index] % 2 == 0){
                sum -= nums[index];
            }
            
            // We Add The Value Of Query To The Nums Element In The Index
            nums[index] += val;
            
            // If Even, We Update The Sum
            if (nums[index] % 2 == 0){
                sum += nums[index];
            }

            result[i] = sum;
        }
    
        return result;
        
    }
}

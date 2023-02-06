class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffleArray = new int[2*n];
        for(int i = 0, j = n; i < n && j < 2*n; i++, j++){
            shuffleArray[i*2] = nums[i];
            shuffleArray[i*2+1] = nums[j];
        }
        return shuffleArray;
    }
}

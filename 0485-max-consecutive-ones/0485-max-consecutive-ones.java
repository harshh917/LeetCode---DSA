class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int MaxCount = 0;

        for ( int num : nums ){
            if (num == 1){
                count ++;
                MaxCount = Math.max(MaxCount, count);
            } else {
                count = 0;
            }
        }
        return MaxCount;
    }
}
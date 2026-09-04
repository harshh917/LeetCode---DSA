class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for ( int i = 0; i < n ; i++){
            int maxleft = Integer.MIN_VALUE ;

            for ( int j = 0 ; j <= i; j++){
                maxleft = Math.max(maxleft, nums[j]);
            }

            int minright = Integer.MAX_VALUE ;

            for ( int j = i ; j < n; j++){
                minright = Math.min(minright, nums[j]);

            }

            int instability = maxleft - minright;

            if ( instability <= k ){
                return i;
            }
        }

        return -1;

        
    }
}
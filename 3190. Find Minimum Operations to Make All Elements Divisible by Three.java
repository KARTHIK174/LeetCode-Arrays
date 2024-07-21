class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int a = nums[i]%3;
            if(a==0) continue;
            else count++;
        }
        return count;
    }
}

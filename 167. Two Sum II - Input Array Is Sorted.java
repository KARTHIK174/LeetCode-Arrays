class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        int startindex=0;
        int endindex=(numbers.length)-1;
        while(startindex<endindex){
            if(numbers[startindex]+numbers[endindex]>target){
                endindex--;
            }else if(numbers[startindex]+numbers[endindex]<target){
                startindex++;
            }else if(numbers[startindex]+numbers[endindex]==target){
                res[0]=startindex+1;
                res[1]=endindex+1;
                return res;
            }
        }
        return res;  
    }
}

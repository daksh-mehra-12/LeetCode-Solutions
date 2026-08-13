class Solution {
    public int[] getConcatenation(int[] nums) {
        int new_arr[] = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            new_arr[i] = nums[i];
        }
        int c = 2*nums.length;
        for(int i=nums.length;i<c;i++){
            new_arr[i] = nums[i - nums.length];
        }
        return new_arr;
    }
}
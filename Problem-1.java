/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        // iterating through the array two times because we need to find two numbers

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){ // starting the loop from second element because the first element has already been selected, so we'll ignore it.
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j}; // forming an array of the elements found
                }
            }
        }
        return new int[]{-1, -1}; // No solution found, so returning -1
    }
}

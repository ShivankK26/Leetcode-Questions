/*
Given an integer x, return true if x is a palindrome, and false otherwise.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
*/  

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int pali = 0;
        int temp = x;
        while(temp!= 0){
            int rem = (temp % 10); // eg- 121, 1. rem = 1, 2. rem = 2, 3. rem = 1  
            pali = pali * 10 + rem; // pali = 1 = 0 * 10 + 1 , pali = 12 = 1 * 10 + 2, pali = 120 + 1 = 121
            temp = temp / 10;
        }
        return (pali == x);
    }
}

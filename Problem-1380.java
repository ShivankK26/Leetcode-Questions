/*

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 
Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

*/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> obj = new ArrayList<>();
        int k = 0; // Variable to store the column index of the minimum value in the current row.
        for(int i = 0; i < matrix.length; i++){
            int rowmin = Integer.MAX_VALUE; // Initialize rowmin to the maximum possible integer value.
            int colmax = Integer.MIN_VALUE; // Initialize colmax to the minimum possible integer value.
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < rowmin){
                    rowmin = matrix[i][j];
                    k = j; // Store the column index where the minimum value was found.
                }
            }

// Loop through all rows in the matrix to find the maximum value in the same column (colmax).
            for(int z = 0; z < matrix.length; z++){
                if(matrix[z][k] > colmax){
                    colmax = matrix[z][k];
                }
            }

// If the minimum value in the row (rowmin) is equal to the maximum value in the column (colmax), add it to the obj list, as it is considered a "lucky number."
            if(rowmin == colmax){
                obj.add(rowmin);
            }
        }
        return obj;
    }
}

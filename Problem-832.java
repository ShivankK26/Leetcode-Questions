/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].


Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

*/


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         
        int row = image.length;
        int col = image[0].length;
        int[][] res = new int[row][col];
        // reversing the column
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = image[i][col - j -1]; // res[i][j] = image[i][col - j - 1]; - This line assigns the value of the corresponding element in the image array, but with columns flipped. It effectively mirrors the image horizontally by copying elements from the rightmost column to the leftmost column in the new res array. col - j - 1 calculates the mirror position by subtracting j from the total number of columns col and then subtracting 1. This effectively mirrors the column index around the center column. 
            }
        }
        
        // flipping the number from 0 to 1 and 1 to 0  
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = res[i][j] == 1 ? 0 : 1; // res[i][j] = res[i][j] == 1 ? 0 : 1; - This line inverts the pixel values in the res array. It replaces 1s with 0s and 0s with 1s, effectively inverting the colors of the image.

            }
        }
        return res;
    }
}

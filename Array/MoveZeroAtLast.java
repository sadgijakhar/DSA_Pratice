package Array;

import java.util.Arrays;

// Given an array arr[] of N positive integers. Push all the zeros of the given array to the right end of the array while maitaining the order of non-zero elements.

// Example 1:

// Input:
// N = 5
// Arr[] = {3, 5, 0, 0, 4}
// Output: 3 5 4 0 0
// Explanation: The non-zero elements
// preserve their order while the 0
// elements are moved to the right.

// Example 2:
// Input:
// N = 4
// Arr[] = {0, 0, 0, 4}
// Output: 4 0 0 0

// Your Task:
// You don't need to read input or print anything. Complete the function pushZerosToEnd() which takes the array arr[] and its size n as input parameters and modifies arr[] in-place such that all the zeroes are moved to the right.  

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ N ≤ 105
// 0 ≤ arri ≤ 105

public class MoveZeroAtLast {

    //Brut Force Approach
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        for(int i = 0 ; i < n ;i++){
            if(arr[i] == 0 && i !=n-1){
                int a = i+1;
                while(arr[a] == 0 && a <n-1){
                    a++;
                }
                int temp = arr[a];
                arr[a] = arr[i];
                arr[i] = temp;
                
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    // Optimise Solution
    void pushZerosToEnd1(int[] arr, int n) {
        int nonZeroIndex = 0;
        
        for (int currentIndex = 0; currentIndex < n; currentIndex++) {
            if (arr[currentIndex] != 0) {
                arr[nonZeroIndex] = arr[currentIndex];
                nonZeroIndex++;
            }
        }
        
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroAtLast m = new MoveZeroAtLast();
        int[] arr = {0,2,0,0,5};
        m.pushZerosToEnd(arr, 5);
    }
}

package Array;

// Given an array Arr of size N, print second largest distinct element from an array.
// Example 1:
// Input: 
// N = 6
// Arr[] = {12, 35, 1, 10, 34, 1}
// Output: 34

// Example 2:
// Input: 
// N = 3
// Arr[] = {10, 5, 10}
// Output: 5

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 2 ≤ N ≤ 105
// 1 ≤ Arri ≤ 105


public class SecondLargestElement {
    //Brut Force Approach
    int print2largest1(int arr[], int n) {
        int max = arr[0];
        int min= arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int i = 1 ; i < n ; i++){
            if(arr[i]> min && arr[i] < max){
                min = arr[i];
            }
        }
        if(min == max){
            return -1;
        }
        return min;
    }

    // Best Approach for this Question 
    int print2largest(int arr[], int n) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            return -1; // No second largest element found
        }

        return secondMax;
    }
    public static void main(String[] args) {
        SecondLargestElement l = new SecondLargestElement();
        int nums[] = {2,4,7,1,4,5,2};
        int n = nums.length;
        System.out.println(l.print2largest(nums, n));
    }
}

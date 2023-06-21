package Array;

import java.util.Arrays;

//Rotate Array
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:
// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]

// Constraints:

// 1 <= nums.length <= 105
// -231 <= nums[i] <= 231 - 1
// 0 <= k <= 105


public class LeftRotate {

    // BRUT FORCE Approach
    void leftRotate(long arr[], int k,int n)
    {
        while(k !=0){
            long a = arr[0];
            for (int i = 0 ; i< n-1 ;i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = a;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Approach 2.o
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int[] nums,int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        LeftRotate l = new LeftRotate();
        long[] arr = {1,2,3,4,5}; 
        l.leftRotate(arr, 2, 5);
    }
}

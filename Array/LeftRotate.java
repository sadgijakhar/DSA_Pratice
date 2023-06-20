package Array;

import java.util.Arrays;

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
    
    public static void main(String[] args) {
        LeftRotate l = new LeftRotate();
        long[] arr = {1,2,3,4,5}; 
        l.leftRotate(arr, 2, 5);
    }
}

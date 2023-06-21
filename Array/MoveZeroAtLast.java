package Array;

import java.util.Arrays;

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

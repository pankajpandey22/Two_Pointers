class Solution {
    void segregate0and1(int[] arr) {
        
        int l = 0;
        int r = arr.length-1;
        
        while (l<r) {
            
            while (l < r && arr[l] == 0) {
                 l++;
            }
             
            while (l < r && arr[r] == 1) {
                 r--;
            }
            
            if (l < r) {
                arr[l] = 0;
                arr[r] = 1;
                l++;
                r--;
            }
        }
        
    }
}

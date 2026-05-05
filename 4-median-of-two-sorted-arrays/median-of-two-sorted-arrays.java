class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int mid = (n + m)/2;
        float ans = 0;
        int[] mergedArray = new int[n + m];
        int two = 0;
        int one = 0;
        int i = 0;
        while(one < n && two < m){
            if(nums1[one] < nums2[two]){
                mergedArray[i] = nums1[one];
                one++;
                }
            else{
                mergedArray[i] = nums2[two];
                two++;
            }
            i++;
        }
        if(one == n && two != m){
                while(two < m){
                    mergedArray[i] = nums2[two];
                    two++;
                    i++;
                }
        }
        if(two == m && one != n){
                while(one < n){
                    mergedArray[i] = nums1[one];
                    one++;
                    i++;
                }
        }
        if((n+m)%2 == 0) ans = (float)(mergedArray[mid]+mergedArray[mid-1])/2;
        else ans = mergedArray[mid];
        for(int in : mergedArray){
            System.out.println(in);
        }
        return ans;
    }
}
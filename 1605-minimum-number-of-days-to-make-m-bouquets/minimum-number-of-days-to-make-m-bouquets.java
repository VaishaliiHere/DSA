class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = findMin(bloomDay);
        int high = findMax(bloomDay);
        if((long)m*k > bloomDay.length) return -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int made = numOfBouquetsMade(mid, bloomDay,k);
            if(made >= m){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int findMin(int[] bloomDay){
        int min = Integer.MAX_VALUE;
        for(int i : bloomDay){
            min = Math.min(min, i);
        }
        return min;
    }
    public int findMax(int[] bloomDay){
        int max = Integer.MIN_VALUE;
        for(int i : bloomDay){
            max = Math.max(max, i);
        }
        return max;
    }
    public int numOfBouquetsMade(int days,int[] arr, int k){
        int bouquet = 0;
        int flowers = 0;
        for(int i : arr){
            if(i <= days){
                flowers++;
                if(flowers == k) {
                    bouquet++;
                    flowers = 0;
                }
            }else{
                flowers = 0;
            }
        }
        return bouquet;
    }
}
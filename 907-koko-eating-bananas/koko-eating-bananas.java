class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int mid = 0;
        while(low <= high){
            mid = (low + high)/2;
            int s = numOfHours(piles, mid);
            if(s <= h){
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int findMax(int[] piles){
        int max = 0;
        for(int bananas : piles){
            max = Math.max(max, bananas);
        }
        return max;
    }

    public int numOfHours(int[] piles, int speed) {
        int hours = 0;
        for (double bananas : piles) {
            hours += Math.ceil(bananas /(double) speed);
        }
        return hours;
    }
}
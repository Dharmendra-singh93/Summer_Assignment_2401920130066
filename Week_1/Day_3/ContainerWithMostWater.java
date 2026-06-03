class Solution {
    public int maxArea(int[] height) {
        int lp=0; int rp=height.length-1;
        int maxWater=0;
        int currwater=0;
        while(lp<rp){
            currwater = (rp-lp)* Math.min(height[lp], height[rp]);
            maxWater = Math.max(currwater,maxWater);
            if(height[lp]<height[rp]){
                lp++;
            } else{
                rp--;
            }
        }
        return maxWater;
    }
}
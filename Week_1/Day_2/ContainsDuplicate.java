class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int value: nums){
            if(!hs.add(value)){  // hs me add bhi ho jayega aur ye return bhi karega boolean
                return true;
            }
        }
        return false;
    }
}
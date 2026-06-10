class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        
        if (sLen == 0) {
            return true;
        }
        if (sLen > tLen) {
            return false;
        }
        
        int sIdx = 0;
        int tIdx = 0;
        
        while (tIdx < tLen) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
                if (sIdx == sLen) {
                    return true;
                }
            }
            tIdx++;
        }
        
        return false;
    }
}

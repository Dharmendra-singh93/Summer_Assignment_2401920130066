class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            if (arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        
        reverse(arr, start, n - 1);
        
        return new String(arr);
    }
    
    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
}

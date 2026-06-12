class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;
        
        while (read < chars.length) {
            char currentChar = chars[read];
            int start = read;
            
            while (read < chars.length && chars[read] == currentChar) {
                read++;
            }
            
            int count = read - start;
            chars[write++] = currentChar;
            
            if (count > 1) {
                int digitsStart = write;
                while (count > 0) {
                    chars[write++] = (char) ((count % 10) + '0');
                    count /= 10;
                }
                int digitsEnd = write - 1;
                while (digitsStart < digitsEnd) {
                    char temp = chars[digitsStart];
                    chars[digitsStart++] = chars[digitsEnd];
                    chars[digitsEnd--] = temp;
                }
            }
        }
        
        return write;
    }
}
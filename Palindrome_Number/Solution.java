class Solution {
    public boolean isPalindrome(int x) {
        // check if x is negative
        if (x < 0) {
            return false;
        }
        
        // reverse the digits of x
        int reverse = 0;
        int original = x;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        
        // compare the reversed integer with the original integer
        return reverse == original;
    }
}

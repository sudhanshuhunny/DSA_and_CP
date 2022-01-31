public class Solution {
    /*
    7. Reverse Integer
Medium

6469

9204

Add to List

Share
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
     */

    public int reverse(int x) {
        if(x<10 && x>-10) {
            return x;
        }
        long ans = 0;
        while(x!=0) {
            ans = ans*10 + x%10;
            x /= 10;
        }
        return ans>=Integer.MIN_VALUE && ans <= Integer.MAX_VALUE ? (int)ans:0;
    }
}


package isPalindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int num = x;
        int reverse = 0;
        boolean result;

        while (x != 0) {
            int d = x % 10;
            reverse = reverse * 10 + d;
            x = x / 10;
        }

        result = reverse == num;

        return result;
    }
}

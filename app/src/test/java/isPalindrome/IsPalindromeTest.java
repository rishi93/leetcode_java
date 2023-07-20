package isPalindrome;

import org.junit.Test;
import static org.junit.Assert.*;

public class IsPalindromeTest {
    @Test public void isPalindromeTest1() {
        int num = 1234;
        boolean expected = false;

        boolean actual = new Solution().isPalindrome(num);

        assertEquals(actual, expected);
    }

    @Test public void isPalindromeTest2() {
        int num = 1221;
        boolean expected = true;

        boolean actual = new Solution().isPalindrome(num);

        assertEquals(actual, expected);
    }
}

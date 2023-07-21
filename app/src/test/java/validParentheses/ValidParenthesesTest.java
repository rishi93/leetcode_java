package validParentheses;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test public void validParenthesesTest1() {
        String s = "()";
        boolean expected = true;

        boolean actual = new Solution().isValid(s);
        assertEquals(expected, actual);
    }

    @Test public void validParenthesesTest2() {
        String s = "()[]{}";
        boolean expected = true;

        boolean actual = new Solution().isValid(s);
        assertEquals(expected, actual);
    }

    @Test public void validParenthesesTest3() {
        String s = "(]";
        boolean expected = false;

        boolean actual = new Solution().isValid(s);
        assertEquals(expected, actual);
    }

    @Test public void validParenthesesTest4() {
        String s = "(";
        boolean expected = false;

        boolean actual = new Solution().isValid(s);
        assertEquals(expected, actual);
    }

    @Test public void validParenthesesTest5() {
        String s = ")";
        boolean expected = false;

        boolean actual = new Solution().isValid(s);
        assertEquals(expected, actual);
    }
}
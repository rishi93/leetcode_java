package lengthOfLastWord;

import org.junit.Test;
import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    @Test public void lengthOfLastWordTest1() {
        String s = "Hello World";
        int expected = 5;

        int actual = new Solution().lengthOfLastWord(s);
        assertEquals(actual, expected);
    }

    @Test public void lengthOfLastWordTest2() {
        String s = "  fly  me  to the  moon  ";
        int expected = 4;

        int actual = new Solution().lengthOfLastWord(s);
        assertEquals(actual, expected);
    }

    @Test public void lengthOfLastWordTest3() {
        String s = "luffy is still joyboy";
        int expected = 6;

        int actual = new Solution().lengthOfLastWord(s);
        assertEquals(actual, expected);
    }
}

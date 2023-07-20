package romanToInt;

import org.junit.Test;
import static org.junit.Assert.*;

public class romanToIntTest {
    @Test public void romanToIntTest1() {
        String s = "III";
        int expected = 3;

        int actual = new Solution().romanToInt(s);
        assertEquals(actual, expected);
    }

    @Test public void romanToIntTest2() {
        String s = "LVIII";
        int expected = 58;

        int actual = new Solution().romanToInt(s);
        assertEquals(actual, expected);
    }

    @Test public void romanToIntTest3() {
        String s = "MCMXCIV";
        int expected = 1994;

        int actual = new Solution().romanToInt(s);
        assertEquals(actual, expected);
    }
}

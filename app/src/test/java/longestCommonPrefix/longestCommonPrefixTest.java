package longestCommonPrefix;

import org.junit.Test;
import static org.junit.Assert.*;

public class longestCommonPrefixTest {
    @Test public void longestCommonPrefixTest1() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";

        String actual = new Solution().longestCommonPrefix(strs);

        assertEquals(actual, expected);
    }

    @Test public void longestCommonPrefixTest2() {
        String[] strs = {"dog", "racecar", "car"};
        String expected = "";

        String actual = new Solution().longestCommonPrefix(strs);

        assertEquals(actual, expected);
    }

    @Test public void longestCommonPrefixTest3() {
        String[] strs = {""};
        String expected = "";

        String actual = new Solution().longestCommonPrefix(strs);

        assertEquals(actual, expected);
    }

    @Test public void longestCommonPrefixTest4() {
        String[] strs = {"flower"};
        String expected = "flower";

        String actual = new Solution().longestCommonPrefix(strs);

        assertEquals(actual, expected);
    }
}
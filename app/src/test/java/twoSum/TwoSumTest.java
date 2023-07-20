package twoSum;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {
     @Test public void twoSumTest1() {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        int[] actual = Solution.twoSum(nums, target);

        assertArrayEquals("Two sum solution failing", expected, actual);
    }

    @Test public void twoSumTest2() {
        int nums[] = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        int[] actual = Solution.twoSum(nums, target);

        assertArrayEquals("Two sum solution failing", expected, actual);
    }

    @Test public void twoSumTest3() {
        int nums[] = {3, 3};
        int target = 6;
        int[] expected = {0, 1};

        int[] actual = Solution.twoSum(nums, target);

        assertArrayEquals("Two sum solution failing", expected, actual);
    }
}
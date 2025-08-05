package TwoSum;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void testExampleOne() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] out = Solution.twoSum(nums, target);

        Assert.assertArrayEquals(new int[]{0, 1}, out);
    }

    @Test
    public void testExampleTwo() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] out = Solution.twoSum(nums, target);

        Assert.assertArrayEquals(new int[]{1, 2}, out);
    }

    @Test
    public void testExampleThree() {
        int[] nums = {3, 3};
        int target = 6;

        int[] out = Solution.twoSum(nums, target);

        Assert.assertArrayEquals(new int[]{0, 1}, out);
    }
}

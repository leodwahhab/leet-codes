package RomanToInt;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void example1() {
        String s = "III";

        int out = solution.romanToInt(s);

        Assert.assertEquals(3, out);
    }

    @Test
    public void example2() {
        String s = "LVIII";

        int out = solution.romanToInt(s);

        Assert.assertEquals(58, out);
    }

    @Test
    public void example3() {
        String s = "MCMXCIV";

        int out = solution.romanToInt(s);

        Assert.assertEquals(1994, out);
    }
}

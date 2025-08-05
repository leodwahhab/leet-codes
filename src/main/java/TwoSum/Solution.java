package TwoSum;

public class Solution {
    /**
     * Finds two indices in the given array such that the numbers at those indices add up to the specified target.
     *
     * <p>You may assume that each input will have exactly one valid solution, and the same element cannot be used twice.
     * The answer can be returned in any order.</p>
     *
     * <p>Examples:</p>
     * <ul>
     *     <li>
     *         Input: nums = [2, 7, 11, 15], target = 9<br>
     *         Output: [0, 1] (because nums[0] + nums[1] == 9)
     *     </li>
     *     <li>
     *         Input: nums = [3, 2, 4], target = 6<br>
     *         Output: [1, 2]
     *     </li>
     *     <li>
     *         Input: nums = [3, 3], target = 6<br>
     *         Output: [0, 1]
     *     </li>
     * </ul>
     *
     * @param nums   an array of integers, where 2 <= nums.length <= 10⁴ and each element is in the range [-10⁹, 10⁹]
     * @param target the integer target value to find as the sum of two distinct elements
     * @return an array of two indices such that nums[i] + nums[j] == target
     * @throws IllegalArgumentException if no valid pair is found (should not happen as per the problem constraints)
     */
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}

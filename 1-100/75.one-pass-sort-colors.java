/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;

        int i = 0;

        while (i <= hi) {
            if (nums[i] == 0) {
                nums[i++] = nums[lo];
                nums[lo++] = 0;
            } else if (nums[i] == 2) {
                nums[i] = nums[hi];
                nums[hi--] = 2;
            } else {
                i++;
            }
        }
    }
}
// @lc code=end

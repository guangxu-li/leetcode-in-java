/*
 * @lc app=leetcode id=159 lang=java
 *
 * [159] Longest Substring with At Most Two Distinct Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        char[] cs = s.toCharArray();
        int[] found = new int[256];
        
        int lo = 0;
        int hi = 0;

        int cnt = 0;
        int len = 0;

        while (hi < cs.length) {
            if (cnt == 2 && found[cs[hi]] == 0) {
                if (--found[cs[lo++]] == 0) {
                    cnt--;
                }
            } else {
                if (found[cs[hi++]]++ == 0) {
                    cnt++;
                }
            }

            len = Math.max(len, hi - lo);
        }

        return len;
    }
}
// @lc code=end


public class Solution {
  public boolean canJump(int[] nums) {
    int nLen = nums.length;
    int maxPos = nums[0];
    for (int pos = 0; pos < nLen - 1; pos++) {
      maxPos = Math.max(maxPos, pos + nums[pos]);
      if (maxPos <= pos) {
        return false;
      }
    }
    return true;
  }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void canJumpExample1() {
    assertTrue(sol.canJump(new int[]{2,3,1,1,4}));
  }
  @Test
  void canJumpExample2() {
    assertFalse(sol.canJump(new int[]{3,2,1,0,4}));
  }
  @Test
  void canJumpExample3() {
    assertTrue(sol.canJump(new int[]{2,0,0}));
  }
}
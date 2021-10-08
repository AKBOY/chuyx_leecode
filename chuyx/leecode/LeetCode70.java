package leecode;
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 记忆化搜索 数学 动态规划 👍 1903 👎 0
/**
 * @author yuxiang.chu
 */
public class LeetCode70 {
    public static void main(String[] args) {
        Solution solution = new LeetCode70().new Solution();

    }

    /**
     * 递归算法就是将大问题拆分成小问题 用小问题的答案整合成大问题的答案
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            int a = 1, b=0, c=0;
            for (int i = 1; i <= n; i++) {
                c=0;
                if (i == 1){
                    c = a;
                }
                if (i > 1){
                    c = b + a;
                }
                b=a;
                a=c;
            }
            return c;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
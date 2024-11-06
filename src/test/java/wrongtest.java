import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @description: 测试Solution4类的maximumGap方法
 *
 * 测试用例设计原则：
 * 1. 等价类划分原则：将输入划分为有效和无效类，确保每个类都有代表性的测试用例。
 * 2. 边界值分析：在边界附近选择测试用例，确保极端情况得到正确处理。
 * 3. 特殊情况：处理特殊输入，例如空数组和数组长度为1的情况。
 */
public class wrongtest {

    /**
     * 测试目的：测试正常情况下的最大差值
     * 用例：输入数组 [3, 6, 9, 1]
     * 故意设定错误的期望输出：返回 4
     */
    @Test
    public void testNormalCase() {
        Solution4 solution = new Solution4();
        int[] nums = {3, 6, 9, 1};
        assertEquals(4, solution.maximumGap(nums)); // 故意设置错误的预期值
    }
}

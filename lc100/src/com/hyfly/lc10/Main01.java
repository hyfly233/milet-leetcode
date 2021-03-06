package com.hyfly.lc10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1. 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * <p>
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * 提示：
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 *
 * @author hyfly
 */
public class Main01 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 1, 3, 4, 5, 7, 1};
        int target = 16;

        System.out.println(Arrays.stream(fun(nums, target)).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }

    public static int[] fun(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                Integer p1 = map.get(target - nums[i]);
                return new int[]{p1, i};
            }
            map.put(nums[i], i);
        }

        return new int[]{0};
    }
}
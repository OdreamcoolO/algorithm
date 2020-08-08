package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author clt
 * @create 2020/7/19 10:49
 * <p>
 * 问题内容是：给定一个数组，给定一个数字。返回数组中可以相加得到指定数字的两个索引。
 * 给定nums = [2, 7, 11, 15], target = 9
 * 那么要返回[0, 1]，因为2 + 7 = 9
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] answer = method2(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    /**
     *
     */
    public static int[] method1(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (data.containsKey(num)) {
                return new int[]{data.get(num), i};
            }
            data.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] method2(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            data.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (data.containsKey(num)) {
                return new int[]{data.get(num), i};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

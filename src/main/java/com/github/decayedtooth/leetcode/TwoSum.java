package com.github.decayedtooth.leetcode;

/**
 * Created by zhangjiong on 2015/12/20.
 */
public class TwoSum {

    public static void main(String[] args) {

    }


    public int[] twoSum(int[] nums, int target) {

        int fixedPoint, movingPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            fixedPoint = i;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
                if (nums[i] + nums[j] > target) {
                    break;
                }
            }

        }

        return null;
    }
}

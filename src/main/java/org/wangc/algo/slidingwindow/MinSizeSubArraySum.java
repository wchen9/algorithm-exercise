package org.wangc.algo.slidingwindow;

/**
 * 03. 给定一个整数数组和一个整数 'S'，寻找最小的连续子数组的长度，其和大于等于 'S'。如果不存在这样的子数组，则返回0。
 * <p>
 * 2021-03-25 20:24:22
 */
public class MinSizeSubArraySum {

    /**
     * 暴力算法
     */
    public static int findMinSubArray(int S, int[] arr) {
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum >= S) {
                    found = true;
                    min = Math.min(j - i + 1, min);
                }
            }
        }
        if (found) {
            return min;
        }
        return 0;
    }

    /**
     * 滑动窗口算法
     */
    public static int findMinSubArrayBySlidingWindow(int S, int[] arr) {
        int windowSum = 0;
        int min = Integer.MAX_VALUE;
        int windowStart = 0;
        // 因窗口需要遍历到数组末尾，结束条件为 arr.length-1
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            // 当windowSum < S 时，窗口向后挪一位
            windowSum += arr[windowEnd];
            // windowSum >= S 时，条件满足，赋值最小窗口，同时缩小窗口直到 windowSum < S
            while (windowSum >= S) {
                min = Math.min(windowEnd - windowStart + 1, min);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return min != Integer.MAX_VALUE ? min : 0;
    }

}

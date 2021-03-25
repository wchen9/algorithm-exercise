package org.wangc.algo.slidingwindow;


import java.util.Arrays;

/**
 * 01. 给定一个数组，计算所有连续的 'K' 长度的子数组的平均数。
 */
public class AverageOfSubarrayOfSizeK {
    public static double[] findAverages(int K, int[] arr) {
        // 对于一个长度为 arr.length 的数组，存在 arr.length - K + 1 个长度为K的子数组
        double[] result = new double[arr.length - K + 1];
        for (int i = 0; i < arr.length - K + 1; i++) {
            double sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += arr[j];
            }
            result[i] = sum / K;
        }
        return result;
    }

    public static double[] findAveragesBySlidingWindow(int K, int[] arr) {
        // 对于一个长度为 arr.length 的数组，存在 arr.length - K + 1 个长度为K的子数组
        double[] result = new double[arr.length - K + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= K - 1) {
                result[windowStart] = windowSum / K;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
}

package org.wangc.algo.slidingwindow;

/**
 * 02. ����һ���������� nums ��һ������ 'K' ���ҵ�������������СΪ K ������������͵����ֵ
 */
public class MaxSumSubArrayOfSizeK {

    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0, windowSum;
        // ���һ�����ڵ��±� arr.length - k
        for (int i = 0; i <= arr.length - k; i++) {
            windowSum = 0;

            for (int j = i; j < i + k; j++) {
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static int findMaxSumSubArrayBySlidingWindow(int k, int[] arr) {
        int maxSum = 0, windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}

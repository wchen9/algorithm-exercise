package org.wangc.algo.slidingwindow;

/**
 * 03. ����һ�����������һ������ 'S'��Ѱ����С������������ĳ��ȣ���ʹ��ڵ��� 'S'����������������������飬�򷵻�0��
 * <p>
 * 2021-03-25 20:24:22
 */
public class MinSizeSubArraySum {

    /**
     * �����㷨
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
     * ���������㷨
     */
    public static int findMinSubArrayBySlidingWindow(int S, int[] arr) {
        int windowSum = 0;
        int min = Integer.MAX_VALUE;
        int windowStart = 0;
        // �򴰿���Ҫ����������ĩβ����������Ϊ arr.length-1
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            // ��windowSum < S ʱ���������Ųһλ
            windowSum += arr[windowEnd];
            // windowSum >= S ʱ���������㣬��ֵ��С���ڣ�ͬʱ��С����ֱ�� windowSum < S
            while (windowSum >= S) {
                min = Math.min(windowEnd - windowStart + 1, min);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return min != Integer.MAX_VALUE ? min : 0;
    }

}

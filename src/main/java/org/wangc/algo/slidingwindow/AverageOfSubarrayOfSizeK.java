package org.wangc.algo.slidingwindow;


import java.util.Arrays;

/**
 * 01. ����һ�����飬�������������� 'K' ���ȵ��������ƽ������
 */
public class AverageOfSubarrayOfSizeK {
    public static double[] findAverages(int K, int[] arr) {
        // ����һ������Ϊ arr.length �����飬���� arr.length - K + 1 ������ΪK��������
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
        // ����һ������Ϊ arr.length �����飬���� arr.length - K + 1 ������ΪK��������
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

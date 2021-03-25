package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfSubarrayOfSizeKTest {

    int[] arr1 = {1, 3, 2, 6, -1, 4, 1, 8, 2};
    int k1 = 5;
    double[] result1 = {2.2, 2.8, 2.4, 3.6, 2.8};

    @Test
    void findAverages() {
        assertArrayEquals(AverageOfSubarrayOfSizeK.findAverages(k1, arr1), result1);
    }

    @Test
    void findAveragesBySlidingWindow() {
        assertArrayEquals(AverageOfSubarrayOfSizeK.findAveragesBySlidingWindow(k1, arr1), result1);
    }
}
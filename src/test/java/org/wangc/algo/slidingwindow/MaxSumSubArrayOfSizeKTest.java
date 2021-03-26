package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumSubArrayOfSizeKTest {

    int[] arr1 = {2, 1, 5, 1, 3, 2};
    int k1 = 3;
    int result1 = 9;

    int[] arr2 = {2, 3, 4, 1, 5};
    int k2 = 2;
    int result2 = 7;

    @Test
    void findMaxSumSubArray() {
        assertEquals(result1, MaxSumSubArrayOfSizeK.findMaxSumSubArray(k1, arr1));
        assertEquals(result2, MaxSumSubArrayOfSizeK.findMaxSumSubArray(k2, arr2));
    }

    @Test
    void findMaxSumSubArrayBySlidingWindow() {
        assertEquals(result1, MaxSumSubArrayOfSizeK.findMaxSumSubArrayBySlidingWindow(k1, arr1));
        assertEquals(result2, MaxSumSubArrayOfSizeK.findMaxSumSubArrayBySlidingWindow(k2, arr2));
    }
}
package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubArraySumTest {

    int[] arr1 = {2, 1, 5, 2, 3, 2};
    int S1 = 7;
    int result1 = 2;

    int[] arr2 = {2, 1, 5, 2, 8};
    int S2 = 7;
    int result2 = 1;

    int[] arr3 = {3, 4, 1, 1, 6};
    int S3 = 8;
    int result3 = 3;

    @Test
    void findMinSubArray() {
        assertEquals(result1, MinSizeSubArraySum.findMinSubArray(S1, arr1));
        assertEquals(result2, MinSizeSubArraySum.findMinSubArray(S2, arr2));
        assertEquals(result3, MinSizeSubArraySum.findMinSubArray(S3, arr3));
    }

    @Test
    void findMinSubArrayBySlidingWindow() {
        assertEquals(result1, MinSizeSubArraySum.findMinSubArrayBySlidingWindow(S1, arr1));
        assertEquals(result2, MinSizeSubArraySum.findMinSubArrayBySlidingWindow(S2, arr2));
        assertEquals(result3, MinSizeSubArraySum.findMinSubArrayBySlidingWindow(S3, arr3));
    }
}
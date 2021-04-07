package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplacingOnesTest {

    int[] a1 = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};
    int k1 = 2;
    int r1 = 6;

    int[] a2 = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
    int k2 = 3;
    int r2 = 9;

    @Test
    void findLength() {
        assertEquals(r1, ReplacingOnes.findLength(a1, k1));
        assertEquals(r2, ReplacingOnes.findLength(a2, k2));
    }
}
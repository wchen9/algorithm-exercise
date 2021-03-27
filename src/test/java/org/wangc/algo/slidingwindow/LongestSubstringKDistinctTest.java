package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringKDistinctTest {

    String str1 = "araaci";
    int K1 = 2;
    int result1 = 4;

    String str2 = "araaci";
    int K2 = 1;
    int result2 = 2;

    String str3 = "cbbebi";
    int K3 = 3;
    int result3 = 5;

    @Test
    void findLength() {
        assertEquals(result1, LongestSubstringKDistinct.findLength(str1, K1));
        assertEquals(result2, LongestSubstringKDistinct.findLength(str2, K2));
        assertEquals(result3, LongestSubstringKDistinct.findLength(str3, K3));
    }

    @Test
    void findLengthBySlidingWindow() {
        assertEquals(result1, LongestSubstringKDistinct.findLengthBySlidingWindow(str1, K1));
        assertEquals(result2, LongestSubstringKDistinct.findLengthBySlidingWindow(str2, K2));
        assertEquals(result3, LongestSubstringKDistinct.findLengthBySlidingWindow(str3, K3));
    }
}
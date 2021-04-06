package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoRepeatSubstringTest {

    String s1 = "aabccbb";
    int r1 = 3;

    String s2 = "abbbb";
    int r2 = 2;

    String s3 = "abccde";
    int r3 = 3;

    @Test
    void findLength() {
        assertEquals(r1, NoRepeatSubstring.findLength(s1));
        assertEquals(r2, NoRepeatSubstring.findLength(s2));
        assertEquals(r3, NoRepeatSubstring.findLength(s3));
    }
}
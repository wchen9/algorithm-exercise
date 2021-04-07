package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    String s1 = "aabdec";
    String p1 = "abc";
    String r1 = "abdec";

    String s2 = "abdabca";
    String p2 = "abc";
    String r2 = "abc";

    String s3 = "adcad";
    String p3 = "abc";
    String r3 = "";

    @Test
    void findSubstring() {
        assertEquals(r1, MinimumWindowSubstring.findSubstring(s1, p1));
        assertEquals(r2, MinimumWindowSubstring.findSubstring(s2, p2));
        assertEquals(r3, MinimumWindowSubstring.findSubstring(s3, p3));
    }
}
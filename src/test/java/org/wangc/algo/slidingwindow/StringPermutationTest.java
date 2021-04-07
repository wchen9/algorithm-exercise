package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPermutationTest {

    String s1 = "oidbcaf";
    String p1 = "abc";
    boolean r1 = true;

    String s2 = "odicf";
    String p2 = "dc";
    boolean r2 = false;

    String s3 = "bcdxabcdy";
    String p3 = "bcdyabcdx";
    boolean r3 = true;

    String s4 = "aaacb";
    String p4 = "abc";
    boolean r4 = true;

    @Test
    void findPermutation() {
        assertEquals(r1, StringPermutation.findPermutation(s1, p1));
        assertEquals(r2, StringPermutation.findPermutation(s2, p2));
        assertEquals(r3, StringPermutation.findPermutation(s3, p3));
        assertEquals(r4, StringPermutation.findPermutation(s4, p4));
    }
}
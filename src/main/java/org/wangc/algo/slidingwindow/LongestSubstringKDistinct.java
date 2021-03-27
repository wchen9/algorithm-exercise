package org.wangc.algo.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 04. �����ַ��� S ���ҵ������ K ����ͬ�ַ�����Ӵ��ĳ��ȡ�
 * 2021-03-27 10:59:43
 */
public class LongestSubstringKDistinct {

    public static int findLength(String str, int K) {
        if (str == null || str.length() == 0 || str.length() < K) {
            throw new IllegalArgumentException();
        }

        int longest = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            Set<Character> distinct = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                distinct.add(str.charAt(j));
                if (distinct.size() > K) {
                    longest = Math.max(j - i, longest);
                    break;
                }
            }
        }
        return longest != Integer.MIN_VALUE ? longest : -1;
    }

    public static int findLengthBySlidingWindow(String str, int K) {
        if (str == null || str.length() == 0 || str.length() < K) {
            throw new IllegalArgumentException();
        }
        int windowStart = 0;
        int longest = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);

            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);
            // �� size > K ʱ��˵�� map ���Ѿ������� K �� char �ַ�����Ҫ��С���ڣ�ֱ�� size <= K
            while (charFrequencyMap.size() > K) {
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                windowStart++;
            }
            longest = Math.max(longest, windowEnd - windowStart + 1);
        }
        return longest;
    }

}

package org.wangc.algo.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 05. ����һ���������� nums ��һ������ 'K' ���ҵ�������������СΪ K ������������͵����ֵ
 */
public class NoRepeatSubstring {

    public static int findLength(String str) {

        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charIndexMap.containsKey(rightChar)) {
                // charIndexMap �в���������ǰ���ڵ��ַ���������֮ǰ���������ַ���
                // �����Ҫ max ����ȡ��ǰ�ظ� char ����һ���ַ���Ϊ start
                windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);
            }
            charIndexMap.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

}

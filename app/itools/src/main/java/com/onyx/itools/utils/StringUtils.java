package com.onyx.itools.utils;

/**
 * @Copyright: Copyright © 2017 Onyx International Inc. All rights reserved.
 * @Project: iTools
 * @Author: Jack
 * @Date: 2017/4/5 0005,0:28
 * @Version: V1.0
 * @Description: TODO
 */
public class StringUtils {
    public static String join(Iterable<?> elements, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (Object e : elements) {
            if (sb.length() > 0)
                sb.append(delimiter);
            sb.append(e);
        }
        return sb.toString();
    }

    public static boolean isNullOrEmpty(final String s) {
        return s == null || s.equals("");
    }

    public static boolean isNotBlank(final String s) {
        return (s != null && s.length() > 0);
    }

    public static int countOccurrencesOf(final String string, final String pattern) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = string.indexOf(pattern,lastIndex);
            if (lastIndex != -1){
                count ++;
                lastIndex += pattern.length();
            }
        }
        return count;
    }
}

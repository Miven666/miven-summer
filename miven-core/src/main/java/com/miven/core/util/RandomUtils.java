package com.miven.core.util;

import java.util.Random;

/**
 * 随机工具类
 * @author mingzhi.xie
 * @date 2019/7/15
 * @since 1.0
 */
public class RandomUtils {
    private static final int INTEGER_MAX_DIGIT = 10;

    private static final int LONG_MAX_DIGIT = 19;

    private static final String DECIMAL_PREFIX = "0.";

    private static final int DECIMAL_PREFIX_LENGTH = 2;

    private static final Random RANDOM = new Random();

    /**
     * 随机生成小于等于指定位数的正整数，(0,X)
     * @param digit 位数
     * @return 正整数
     */
    public static long positiveNumber(int digit) {
        if (digit <= 0 || digit >= LONG_MAX_DIGIT + 1) {
            throw new IllegalArgumentException();
        } else if (digit > INTEGER_MAX_DIGIT) {
            long nextLong = RANDOM.nextLong();
            if (nextLong == 0) {
                nextLong = positiveNumber(digit);
            }
            String stringLong = String.valueOf(nextLong);
            if (nextLong < 0) {
                stringLong = stringLong.substring(1);
                nextLong = Long.parseLong(stringLong);
            }
            return digit < stringLong.length() ? Long.parseLong(stringLong.substring(0, digit)) : nextLong;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(1);
        for (int i = 0; i < digit; i++) {
            sb.append(0);
        }
        return RANDOM.nextInt(Integer.parseInt(sb.toString()));
    }

    /**
     * 随机生成小于等于指定位数的正小数，(0,1)
     * @param digit 位数
     * @return 小数
     */
    public static double positiveDecimal(int digit) {
        double nextDouble = Math.random();
        String strDouble = String.valueOf(nextDouble);
        int validLength = strDouble.length() - DECIMAL_PREFIX_LENGTH;
        if (digit > validLength) {
            strDouble = strDouble + positiveNumber(digit - validLength);
        }

        return Double.parseDouble(strDouble.substring(0, digit + DECIMAL_PREFIX_LENGTH));
    }
}

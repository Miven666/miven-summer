package com.miven.core.util;

import org.junit.Test;

public class RandomUtilsTest {

    @Test
    public void randomPositiveInt() {
        System.out.println("随机生成小于等于 5 位数的正整数 ==> " + RandomUtils.positiveNumber(5));
        System.out.println("随机生成小于等于 7 位数的正整数 ==> " + RandomUtils.positiveNumber(7));
        System.out.println("随机生成小于等于 9 位数的正整数 ==> " + RandomUtils.positiveNumber(9));
    }

    @Test
    public void positiveDecimal() {
        System.out.println("随机生成小于等于 3 位数的正小数 ==> " + RandomUtils.positiveDecimal(3));
        System.out.println("随机生成小于等于 4 位数的正小数 ==> " + RandomUtils.positiveDecimal(4));
        System.out.println("随机生成小于等于 5 位数的正小数 ==> " + RandomUtils.positiveDecimal(5));
    }
}
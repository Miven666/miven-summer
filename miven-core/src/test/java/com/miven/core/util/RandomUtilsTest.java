package com.miven.core.util;

import org.junit.Test;

public class RandomUtilsTest {

    @Test
    public void randomPositiveInt() {
        System.out.println("随机生成小于等于5位数的正整数 ==> " + RandomUtils.positiveNumber(5));
        System.out.println("随机生成小于等于7位数的正整数 ==> " + RandomUtils.positiveNumber(7));
        System.out.println("随机生成小于等于9位数的正整数 ==> " + RandomUtils.positiveNumber(9));
    }

    @Test
    public void positiveDecimal() {
        System.out.println("随机生成小于等于3位小数的正小数 ==> " + RandomUtils.positiveDecimal(3));
        System.out.println("随机生成小于等于4位小数的正小数 ==> " + RandomUtils.positiveDecimal(4));
        System.out.println("随机生成小于等于5位小数的正小数 ==> " + RandomUtils.positiveDecimal(5));
    }
}
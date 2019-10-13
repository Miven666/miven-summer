package com.miven.core.util;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testFormatComment() {
        String comment = "Determines if the class or interface represented by this\n" +
                "     * {@code Class} object is either the same as, or is a superclass or\n" +
                "     * superinterface of, the class or interface represented by the specified\n" +
                "     * {@code Class} parameter. It returns {@code true} if so;\n" +
                "     * otherwise it returns {@code false}. If this {@code Class}\n" +
                "     * object represents a primitive type, this method returns\n" +
                "     * {@code true} if the specified {@code Class} parameter is\n" +
                "     * exactly this {@code Class} object; otherwise it returns\n" +
                "     * {@code false}.";
        comment = StringUtils.formatComment(comment);
        System.out.println(comment);
    }
}
package com.miven.core.util;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testFormatComment() {
        String comment = "Spring's bean definition readers expect to work on an implementation of this\n" +
                " * interface. Known implementors within the Spring core are DefaultListableBeanFactory\n" +
                " * and GenericApplicationContext.";
        comment = StringUtils.formatComment(comment);
        System.out.println(comment);
    }
}
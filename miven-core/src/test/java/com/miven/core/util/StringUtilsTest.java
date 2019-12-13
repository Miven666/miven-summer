package com.miven.core.util;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testFormatComment() {
        String comment = "As {@link LocalValidatorFactoryBean} exposes 3 validator related contracts and we're\n" +
                " * only checking for the absence {@link javax.validation.Validator}, we should flag the\n" +
                " * auto-configured validator as primary only if no Spring's {@link Validator} is flagged\n" +
                " * as primary.";
        comment = StringUtils.formatComment(comment);
        System.out.println(comment);
    }
}
package com.miven.logging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日志拦截注解
 * @author mingzhi.xie
 * @date 2019/10/12
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Logging {
    /**
     * 日志级别，默认 INFO
     */
    Level level() default Level.INFO;
}

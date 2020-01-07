package com.miven.core.validation.constraints;

import com.miven.core.validation.validators.TimeIntervalValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 时间间隔校验注解
 * @author mingzhi.xie
 * @date 2020/1/7
 * @since 1.0
 */
@Documented
@Target(TYPE)
@Retention(RUNTIME)
@Repeatable(TimeInterval.List.class)
@Constraint(validatedBy = TimeIntervalValidator.class)
public @interface TimeInterval {

    Start start();

    End end();

    String message() default "时间间隔必须大于0";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Start {
        /**
         * 开始时间的字段名称
         */
        String property() default "startTime";
        /**
         * 默认时间戳格式，如：1577836800000
         */
        String format() default "";
    }

    @Target(TYPE)
    @Retention(RUNTIME)
    @interface End {
        /**
         * 结束时间的字段名称
         */
        String property() default "endTime";
        /**
         * 默认时间戳格式，如：1577836800000
         */
        String format() default "";
    }

    @Target(TYPE)
    @Retention(RUNTIME)
    @Documented
    @interface List {
        TimeInterval[] value();
    }
}

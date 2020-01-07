package com.miven.core.validation.validators;

import com.miven.core.util.StringUtils;
import com.miven.core.validation.constraints.TimeInterval;
import com.miven.core.validation.constraints.TimeInterval.End;
import com.miven.core.validation.constraints.TimeInterval.Start;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 时间间隔校验器
 * @author mingzhi.xie
 * @date 2020/1/7
 * @since 1.0
 */
@Slf4j
public class TimeIntervalValidator implements ConstraintValidator<TimeInterval, Object> {

    private Start start;

    private End end;

    @Override
    public void initialize(TimeInterval constraintAnnotation) {
        this.start = constraintAnnotation.start();
        this.end = constraintAnnotation.end();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (null == value) {
            return true;
        }

        try {
            Class<?> valueClass = value.getClass();
            Field startField = valueClass.getDeclaredField(start.property());
            Field endField = valueClass.getDeclaredField(end.property());
            startField.setAccessible(true);
            endField.setAccessible(true);
            Object startTime = startField.get(value);
            Object endTime = endField.get(value);

            if (null == startTime || null == endTime) {
                return true;
            }
            int result = 0;
            if (startTime instanceof Date && endTime instanceof Date) {
                result = ((Date) endTime).compareTo((Date) startTime);
            }
            if (startTime instanceof String && endTime instanceof String) {
                if (StringUtils.isBlank(start.format())) {
                    result = new Date(Long.parseLong((String) endTime)).compareTo(new Date(Long.parseLong((String) startTime)));
                } else {
                    String startFormat = start.format();
                    String endFormat = end.format();
                    DateTimeFormatter startFormatter = DateTimeFormatter.ofPattern(startFormat);
                    DateTimeFormatter endFormatter = DateTimeFormatter.ofPattern(endFormat);
                    LocalDateTime startDateTime = LocalDateTime.parse((String) startTime, startFormatter);
                    LocalDateTime endDateTime = LocalDateTime.parse((String) endTime, endFormatter);
                    result = endDateTime.compareTo(startDateTime);
                }
            }

            return result > 0;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }
}
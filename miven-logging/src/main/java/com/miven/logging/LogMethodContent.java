package com.miven.logging;

import java.lang.reflect.Method;

/**
 * 方法日志信息
 * @author mingzhi.xie
 * @date 2019/10/11
 * @since 1.0
 */
public class LogMethodContent extends LogContent{
    /**
     * 方法
     */
    protected Method method;
    /**
     * 耗时
     */
    protected long consumingTime;
}

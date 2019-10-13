package com.miven.spring.boot.autoconfigure.logging;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 日志方法拦截器
 * @author mingzhi.xie
 * @date 2019/10/11
 * @since 1.0
 */
public class MethodLogInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("LogMethodInterceptor invoke");
        return invocation.proceed();
    }
}

package com.miven.spring.boot.autoconfigure.logging;

import com.miven.logging.LogMethodContent;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 日志方法拦截器
 * @author mingzhi.xie
 * @date 2019/10/11
 * @since 1.0
 */
@Slf4j
public class MethodLogInterceptor implements MethodInterceptor {

    private LogMethodContent content = new LogMethodContent();

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // TODO 将参数格式化输出
        System.out.println(content);
        return invocation.proceed();
    }
}

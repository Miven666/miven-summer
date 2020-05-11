package com.miven.spring.boot.autoconfigure.logging;

import com.miven.logging.Logging;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.AbstractSingletonProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.AbstractBeanFactoryAwareAdvisingPostProcessor;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.beans.factory.InitializingBean;

import java.lang.annotation.Annotation;

/**
 * 增强方法日志输出的处理器
 *
 * @author mingzhi.xie
 * @date 2019/10/11
 * @since 1.0
 * @see ScopedProxyFactoryBean
 * @see AbstractSingletonProxyFactoryBean
 */
public class MethodLogAdvisingPostProcessor extends AbstractBeanFactoryAwareAdvisingPostProcessor implements InitializingBean {

    private static final long serialVersionUID = -2593285466220107057L;

    private final Class<? extends Annotation> logAnnotationType = Logging.class;

    protected Advice createMethodLogInterceptor() {
        return new MethodLogInterceptor();
    }

    @Override
    public void afterPropertiesSet() {
        Pointcut pointcut = new AnnotationMatchingPointcut(this.logAnnotationType, this.logAnnotationType,true);
        super.advisor = new DefaultPointcutAdvisor(pointcut, createMethodLogInterceptor());
    }
}

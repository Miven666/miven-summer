package com.miven.spring.boot.autoconfigure.logging;

import com.miven.logging.LogContent;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 日志自动配置类
 * @author mingzhi.xie
 * @date 2019/10/11
 * @since 1.0
 */
@Configuration
@ConditionalOnClass(LogContent.class)
public class LoggingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MethodLogAdvisingPostProcessor methodLogAdvisingPostProcessor() {
        return new MethodLogAdvisingPostProcessor();
    }
}

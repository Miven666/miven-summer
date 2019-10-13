package com.miven.logging;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.PropertyPreFilters;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 日志信息
 * @author mingzhi.xie
 * @date 2019/10/11
 * @since 1.0
 */
@Getter
@Setter
public class LogContent implements Serializable {
    private static final long serialVersionUID = -5803742959496051744L;
    protected PropertyPreFilters.MySimplePropertyPreFilter propertyPreFilter = new PropertyPreFilters().addFilter();

    @JSONField(ordinal = 1000)
    protected String exception;
    @JSONField(ordinal = 2000)
    protected String msg;

    protected void filterProperty() {
        propertyPreFilter.addExcludes("propertyPreFilter");
        if (exception == null && msg == null) {
            propertyPreFilter.addExcludes("exception", "msg");
        }
    }

    @Override
    public String toString() {
        filterProperty();
        return JSON.toJSONString(this, propertyPreFilter, SerializerFeature.WriteMapNullValue);
    }
}

package com.miven.logging;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Getter;
import lombok.Setter;

/**
 * 方法日志信息
 * @author mingzhi.xie
 * @date 2019/10/11
 * @since 1.0
 */
@Setter
@Getter
public class LogMethodContent extends LogContent {
    private static final long serialVersionUID = -433906078857739516L;

    /**
     * 模块名,例如：{@link Module.SpringModule#Controller}
     * @see Module
     */
    @JSONField(ordinal = 100)
    private String module;
    /**
     * 映射地址
     */
    @JSONField(ordinal = 200)
    private String mapping;
    /**
     * 方法名
     */
    @JSONField(ordinal = 300)
    private String method;
    /**
     * 耗时
     */
    @JSONField(ordinal = 400)
    private long millisecond;


    @JSONField(ordinal = 5000)
    private String returned;
    @JSONField(ordinal = 6000)
    private String parameter;

    @Override
    protected void filterProperty() {
        super.filterProperty();
        if (!Module.SpringModule.Controller.name().equalsIgnoreCase(module)) {
            propertyPreFilter.addExcludes("mapping", "host");
        }
    }

    @Override
    public String toString() {
        filterProperty();
        return JSON.toJSONString(this, propertyPreFilter, SerializerFeature.WriteMapNullValue);
    }
}

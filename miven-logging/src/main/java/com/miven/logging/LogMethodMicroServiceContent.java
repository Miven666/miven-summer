package com.miven.logging;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Getter;
import lombok.Setter;

/**
 * 微服务方法日志信息
 * @author mingzhi.xie
 * @date 2019/10/12
 * @since 1.0
 */
@Getter
@Setter
public class LogMethodMicroServiceContent extends LogMethodContent {
    private static final long serialVersionUID = 3538082186736345581L;

    /**
     * 服务名
     */
    @JSONField(ordinal = 10)
    private String server;
    /**
     * 域名
     */
    @JSONField(ordinal = 20)
    protected String host;
    /**
     * 全链路ID
     */
    @JSONField(ordinal = 30)
    protected String traceId;
    /**
     * 分片ID
     */
    @JSONField(ordinal = 31)
    private String spanId;

    @Override
    protected void filterProperty() {
        super.filterProperty();
    }

    @Override
    public String toString() {
        filterProperty();
        return JSON.toJSONString(this, propertyPreFilter, SerializerFeature.WriteMapNullValue);
    }
}

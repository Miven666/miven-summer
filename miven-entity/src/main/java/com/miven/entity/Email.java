package com.miven.entity;

import lombok.Data;

/**
 *  邮箱
 * @author mingzhi.xie
 * @date 2019/8/27
 * @since 1.0
 */
@Data
public class Email {

    private String to;

    private String body;

    @Override
    public String toString() {
        return String.format("Email{to=%s, body=%s}", getTo(), getBody());
    }
}

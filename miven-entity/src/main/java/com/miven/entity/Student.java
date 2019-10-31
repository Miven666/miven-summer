package com.miven.entity;

import lombok.Builder;

import java.io.Serializable;

/**
 * 学生
 *
 * @author mingzhi.xie
 * @date 2019/5/29.
 */

@Builder
public class Student implements Serializable {

    private static final long serialVersionUID = -2610980948249554868L;

    private long id;

    private String name;

    private Integer age;
}

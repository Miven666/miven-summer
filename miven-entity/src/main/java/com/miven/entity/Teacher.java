package com.miven.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 老师
 * @author mingzhi.xie
 * @date 2019/12/12
 * @since 1.0
 */
@Data
public class Teacher implements Serializable {

    private static final long serialVersionUID = 4553874975140965482L;

    private long id;

    private String name;

    private Integer age;
}
package com.miven.entity;

import lombok.Data;

/**
 *  书
 * @author mingzhi.xie
 * @date 2019/8/28
 * @since 1.0
 */
@Data
public class Book {
    /**
     *  国际标准书号
     */
    private String isbn;

    private String title;
}

package com.miven.core.util;

/**
 * 字符串工具类
 * @author mingzhi.xie
 * @date 2019/7/17
 * @since 1.0
 */
public class StringUtils {

    /**
     * 去除多行注释中'*'和换行
     * @param comment 注释
     * @return 注释文本
     */
    public static String formatComment(String comment) {
        return comment.replace(" * ", " ")
                .replace("<p>", "").replace("</p>", "")
                .replace("<ul>", "").replace("</ul>", "")
                .replace("<li>", "").replace("</li>", "")
                .replace("<em>", "").replace("</em>", "")
                .replace("<i>", "").replace("</i>", "")
                .replace("@link ", "")
                .replace("@code ", "")
                .replace("@", "")
                .replace("{", "").replace("}", "")
                .replaceAll("[\r\n]", " ");
    }
}

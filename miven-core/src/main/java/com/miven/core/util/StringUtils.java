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
                .replace("<b>", "").replace("</b>", "")
                .replace("@link ", "")
                .replace("@code ", "")
                .replace("@", "")
                .replace("{", "").replace("}", "")
                .replaceAll("[\r\n]", " ");
    }

    /**
     * <p>Checks if a CharSequence is empty (""), null or whitespace only.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace only
     */
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * <p>Checks if a CharSequence is not empty (""), not null and not whitespace only.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.isNotBlank(null)      = false
     * StringUtils.isNotBlank("")        = false
     * StringUtils.isNotBlank(" ")       = false
     * StringUtils.isNotBlank("bob")     = true
     * StringUtils.isNotBlank("  bob  ") = true
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is
     *  not empty and not null and not whitespace only
     * @since 2.0
     * @since 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)
     */
    public static boolean isNotBlank(final CharSequence cs) {
        return !isBlank(cs);
    }
}

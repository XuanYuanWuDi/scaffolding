package com.lzx.scaffold.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:27
 * @Description: 时间工具类
 */
public class DateUtil {


    public static final String YEAR_MONTH_DAY_SECOND = "yyyy-MM-dd HH:mm:ss";
    public static final String YEAR_MONTH_DAY_SECOND2 = "yyyy/MM/dd HH:mm:ss";
    public static final String YEAR_MONTH_DAY_SECOND3 = "yyyy年MM月dd日 HH时mm分ss秒";
    public static final String YEAR_MONTH_DAY = "yyyy-MM-dd";
    public static final String YEAR_MONTH_DAY2 = "yyyy年MM月dd日";
    public static final String YEAR_MONTH_DAY_SECOND_MILLISECOND = "yyyy-MM-dd HH:mm:ss:SSS";

    /**
     * 采用 ThreadLocal 避免 SimpleDateFormat 非线程安全的问题
     * <p>
     * Key —— 时间格式
     * Value —— 解析特定时间格式的 SimpleDateFormat
     */
    private static ThreadLocal<Map<String, SimpleDateFormat>> threadLocal = new ThreadLocal<Map<String, SimpleDateFormat>>();

    /**
     * 获取解析特定时间格式的 SimpleDateFormat
     *
     * @param pattern 时间格式
     */
    private static SimpleDateFormat getDateFormat(String pattern) {
        Map<String, SimpleDateFormat> strDateFormatMap = threadLocal.get();

        if (strDateFormatMap == null) {
            strDateFormatMap = new HashMap<String, SimpleDateFormat>();
        }

        SimpleDateFormat simpleDateFormat = strDateFormatMap.get(pattern);
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat(pattern, Locale.getDefault());
            strDateFormatMap.put(pattern, simpleDateFormat);
            threadLocal.set(strDateFormatMap);
        }

        return simpleDateFormat;
    }




    /**
     * 时间格式化
     *
     * @param date：要格式化的时间
     * @param pattern：要格式化的类型
     */
    public static String formatDate(Date date, String pattern) {
        if (date == null || pattern == null) {
            return null;
        }

        return getDateFormat(pattern).format(date);
    }
}

package ru.lysakov.lab2.util;

import java.text.SimpleDateFormat;

public class DateTimeUtil {
    public static SimpleDateFormat getCustomFormat() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SS'Z'");
    }
}

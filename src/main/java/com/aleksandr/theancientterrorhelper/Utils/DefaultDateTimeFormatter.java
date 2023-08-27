package com.aleksandr.theancientterrorhelper.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public final class DefaultDateTimeFormatter {
    public static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd'T'HH:mm:ss")
            .appendFraction(ChronoField.MILLI_OF_SECOND, 0, 3, true)
            .optionalStart()
            .appendLiteral('Z')
            .toFormatter();

    private DefaultDateTimeFormatter() {
        throw new AssertionError();
    }

    public static String localDateTimeToString(LocalDateTime date) {
        return date != null ? date.format(FORMATTER) : null;
    }

    public static LocalDateTime stringToLocalDateTime(String s) {
        return s != null ? LocalDateTime.parse(s, FORMATTER) : null;
    }
}

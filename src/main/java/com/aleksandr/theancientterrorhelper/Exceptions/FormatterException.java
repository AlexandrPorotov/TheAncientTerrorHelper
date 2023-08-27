package com.aleksandr.theancientterrorhelper.Exceptions;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class FormatterException extends RuntimeException{

    private static final String REPLACER = "{}";

    public FormatterException(String message, Object... args) {
        super(format(message, args));
    }

    public FormatterException(Throwable throwable, String message, Object... args) {
        super(format(message, args), throwable);
    }

    private static String format(String message, Object... args) {
        if (ArrayUtils.isEmpty(args)) {
            return message;
        }
        for (Object arg : args) {
            message = StringUtils.replaceOnce(message, REPLACER, arg == null ? "" : arg.toString());
        }
        return message;
    }
}

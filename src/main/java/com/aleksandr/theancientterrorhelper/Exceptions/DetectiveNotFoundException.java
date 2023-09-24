package com.aleksandr.theancientterrorhelper.Exceptions;

public class DetectiveNotFoundException extends FormatterException{

    public DetectiveNotFoundException(Throwable throwable, String message, Object... args) {
        super(throwable, message, args);
    }
}

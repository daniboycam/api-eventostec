package com.eventostec.api.exceptions;

public class InvalidImageDataException extends RuntimeException {
    public InvalidImageDataException() {
        super("Image processing failure or required field missing.");
    }

    public InvalidImageDataException(String message) {
        super(message);
    }
}

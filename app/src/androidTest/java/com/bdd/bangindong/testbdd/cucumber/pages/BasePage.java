package com.bdd.bangindong.testbdd.cucumber.pages;


public class BasePage {

    public <T extends BasePage> T is(Class<T> type) {
        if (type.isInstance(this)) {
            return type.cast(this);
        } else {
            throw new InvalidPageException("Invalid page type. Expected: " + type.getSimpleName() + ", but got: " + this.getClass().getSimpleName());
        }
    }

    public static class InvalidPageException extends RuntimeException {

        InvalidPageException(final String message) {
            super(message);
        }
    }
}

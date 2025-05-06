package com.zerck.postApp.validation;

import java.util.regex.Pattern;

public class IdChecker {

    private final Pattern USERNAME_PATTERN = Pattern.compile("^[a-z0-9_]{4,16}$");

    private String username;
    public IdChecker(String username) {
        this.username = username;
    }
}

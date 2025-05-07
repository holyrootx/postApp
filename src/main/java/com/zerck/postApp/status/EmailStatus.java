package com.zerck.postApp.status;

import lombok.Getter;

@Getter
public enum EmailStatus {

    AVAILABLE("사용 가능한 이메일입니다."),

    INVALID("부적절한 이메일입니다."),

    INVALID_PATTERN("이메일은 소문자, 숫자, 밑줄(_)만 사용 가능합니다."),

    DUPLICATE("이미 사용 중인 이메일입니다."),

    LENGTH_INVALID("이메일은 6자 이상 20자 이하만 가능합니다."),

    EMPTY("이메일은 공백으로 사용할 수 없습니다."),

    FAILED("요청이 실패했습니다.");

    private final String message;
    EmailStatus(String message){
        this.message = message;
    }
}

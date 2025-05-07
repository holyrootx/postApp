package com.zerck.postApp.status;

import lombok.Getter;

@Getter
public enum UsernameStatus {

    AVAILABLE("사용 가능한 아이디 입니다."),

    INVALID("부적절한 아이디 입니다."),

    INVALID_PATTERN("아이디는 소문자, 숫자, 밑줄(_)만 사용 가능합니다."),

    DUPLICATE("이미 사용 중인 아이디 입니다."),

    LENGTH_INVALID("아이디는 6자 이상 20자 이하만 가능합니다."),

    EMPTY("아이디는 공백으로 생성할 수 없습니다."),

    FAILED("요청이 실패했습니다.");

    private final String message;
    UsernameStatus(String message){
        this.message = message;
    }

}

package com.zerck.postApp.status;

import lombok.Getter;

@Getter
public enum JoinResponseStatus {

    SUCCESS("회원가입이 완료되었습니다."),

    SERVER_ERROR("서버 내부 오류가 발생했습니다. 잠시 후 다시 시도해 주세요."),

    DUPLICATE_USERNAME("이미 사용 중인 아이디입니다."),

    DUPLICATE_EMAIL("이미 사용 중인 이메일입니다."),

    INVALID_USERNAME_FORMAT("아이디는 영문자와 숫자 조합으로 5~20자여야 합니다."),

    INVALID_PASSWORD_FORMAT("비밀번호는 최소 8자 이상이어야 하며, 숫자 및 특수문자를 포함해야 합니다."),

    INVALID_EMAIL_FORMAT("유효하지 않은 이메일 형식입니다."),

    MISSING_REQUIRED_FIELDS("필수 입력 항목이 누락되었습니다."),

    PASSWORDS_DO_NOT_MATCH("비밀번호와 비밀번호 확인이 일치하지 않습니다."),

    WEAK_PASSWORD("비밀번호가 너무 취약합니다. 다른 비밀번호를 사용해 주세요.");

    private final String message;
    JoinResponseStatus(String message){
        this.message = message;
    }

}

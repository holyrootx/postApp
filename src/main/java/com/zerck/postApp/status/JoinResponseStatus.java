package com.zerck.postApp.status;

import lombok.Getter;

@Getter
public enum JoinResponseStatus {

    SUCCESS("회원가입이 완료되었습니다."),

    SERVER_ERROR("서버 내부 오류가 발생했습니다. 잠시 후 다시 시도해 주세요."),

    AVAILABLE_USERNAME("사용 가능한 아이디입니다."),
    AVAILABLE_EMAIL("사용 가능한 이메일입니다."),
    AVAILABLE_PASSWORD("사용 가능한 비밀번호입니다."),
    AVAILABLE_FIRSTNAME("사용 가능한 이름입니다."),
    AVAILABLE_LASTANAME("사용 가능한 성입니다."),
    AVAILABLE_NAME("사용 가능한 이름입니다."),

    DUPLICATE_USERNAME("이미 사용 중인 아이디입니다."),
    DUPLICATE_EMAIL("이미 사용 중인 이메일입니다."),

    EMPTY_USERNAME("아이디는 공백으로 생성할 수 없습니다."),
    EMPTY_EMAIL("이메일은 공백으로 생성할 수 없습니다."),
    EMPTY_PASSWORD("비밀번호는 공백으로 생성할 수 없습니다."),
    EMPTY_NAME("성, 이름은 공백으로 생성할 수 없습니다."),
//    INVALID_USERNAME_FORMAT("아이디는 특수문자, 대소문자, 숫자 조합으로 6~20자여야 합니다."),
//    INVALID_PASSWORD_FORMAT("비밀번호는 최소 8자 이상이어야 하며, 숫자 및 특수문자를 포함해야 합니다."),
    REQUIRED_UPPERCASE_PASSWORD("비밀번호에는 대문자가 최소 1자 이상 포함되어야 합니다."),
    REQUIRED_LOWERCASE_PASSWORD("비밀번호에는 소문자가 최소 1자 이상 포함되어야 합니다."),
    REQUIRED_NUMBER_PASSWORD("비밀번호에는 숫자가 최소 1자 이상 포함되어야 합니다."),
    REQUIRED_SPECIAL_PASSWORD("비밀번호에는 특수문자가 최소 1자 이상 포함되어야 합니다."),

    NOT_ALLOWED_NUMBER_NAME("성, 이름에 숫자는 사용할 수 없습니다."),
    NOT_ALLOWED_SPECIAL_USERNAME("아이디는 영소문자, 숫자, 하이픈(-), 언더바(_)만 사용할 수 있습니다."),
    INVALID_LENGTH_EMAIL("이메일은 6자 이상 20자 이하만 가능합니다."),
    INVALID_LENGTH_PASSWORD("비밀번호는 6자 이상 20자 이하만 가능합니다."),
    INVALID_LENGTH_USERNAME("아이디는 6자 이상 20자 이하만 가능합니다."),
    INVALID_LENGTH_NAME("성, 이름은 각 1자 이상만 가능합니다."),

    INVALID_FORMAT_EMAIL("이메일은 소문자, 숫자, 밑줄(_)만 사용 가능합니다."),
    INVALID_FORMAT_PASSWORD("유효하지 않은 비밀번호 형식입니다."),
    INVALID_FORMAT_USERNAME("유효하지 않은 아이디 형식입니다."),
    INVALID_FORMAT_NAME("유효하지 않은 이름 형식입니다."),

    MISSING_REQUIRED_FIELDS("필수 입력 항목이 누락되었습니다."),
    PASSWORDS_DO_NOT_MATCH("비밀번호와 비밀번호 확인이 일치하지 않습니다."),

    WEAK_PASSWORD("비밀번호가 너무 취약합니다. 다른 비밀번호를 사용해 주세요.");



    private final String message;
    JoinResponseStatus(String message){
        this.message = message;
    }

}

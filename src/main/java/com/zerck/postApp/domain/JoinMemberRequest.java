package com.zerck.postApp.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinMemberRequest {

    @NotBlank(message = "아이디는 필수로 입력해주세요.")
    @Size(min = 6, max = 20, message = "아이디는 6자 이상 20자 이하여야해요.")
    @Pattern(regexp = "^[a-z0-9_-]+$", message = "아이디는 영소문자, 숫자, 하이픈(-), 언더바(_)만 사용해야해요.")
    private String username;

    @NotBlank(message = "비밀번호는 필수로 입력해주세요.")
    @Size(min = 6, max = 20, message = "비밀번호는 6자 이상 20자 이하여야 합니다.")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>])[A-Za-z\\d!@#$%^&*(),.?\":{}|<>]{6,20}$",
            message = "비밀번호는 소문자, 대문자, 숫자, 특수문자를 각각 최소 1자 이상 포함해야해요."
    )
    private String password;

    @NotBlank(message = "이메일은 필수로 입력해주세요.")
    @Email(message = "올바른 이메일 형식이 아니에요.")
    private String email;

    @NotBlank(message = "성을 필수로 입력해주세요.")
    @Pattern(regexp = "^[가-힣]{1,}$", message = "성은 한글만 사용할 수 있어요.")
    private String lastname;

    @NotBlank(message = "이름을 필수로 입력해주세요.")
    @Pattern(regexp = "^[가-힣]{1,}$", message = "이름은 한글만 사용할 수 있어요.")
    private String firstname;
}


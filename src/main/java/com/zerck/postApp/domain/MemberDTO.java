package com.zerck.postApp.domain;

import lombok.Data;

@Data
public class MemberDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
}

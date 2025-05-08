package com.zerck.postApp.response;

import com.zerck.postApp.status.JoinResponseStatus;
import lombok.Getter;

@Getter
public class JoinResponse {

    private String status;
    private String message;
    private JoinResponseStatus joinResponseStatus;

    public JoinResponse(JoinResponseStatus joinResponseStatus) {
        this.status = joinResponseStatus.name();
        this.message = joinResponseStatus.getMessage();
    }
    public JoinResponseStatus toEnum() {
        return JoinResponseStatus.valueOf(this.status);
    }

}

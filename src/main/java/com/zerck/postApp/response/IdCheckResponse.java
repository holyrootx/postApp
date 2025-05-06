package com.zerck.postApp.response;

import com.zerck.postApp.status.UsernameStatus;
import lombok.Getter;

/**
 * IdCheckResponse
 */
@Getter
public class IdCheckResponse {

    private String status;
    private String message;
    public IdCheckResponse(UsernameStatus usernameStatus) {
        this.status = usernameStatus.name();
        this.message = usernameStatus.getMessage();
    }
}

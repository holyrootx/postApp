package com.zerck.postApp.response;

import com.zerck.postApp.status.EmailStatus;
import lombok.Getter;

/**
 * EmailCheckResponse
 */
@Getter
public class EmailCheckResponse {

    private String status;
    private String message;
    public EmailCheckResponse(EmailStatus emailStatus) {
        this.status = emailStatus.name();
        this.message = emailStatus.getMessage();
    }

}

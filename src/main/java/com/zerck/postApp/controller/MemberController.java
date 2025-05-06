package com.zerck.postApp.controller;

import com.zerck.postApp.response.EmailCheckResponse;
import com.zerck.postApp.response.IdCheckResponse;
import com.zerck.postApp.service.MemberService;
import com.zerck.postApp.status.EmailStatus;
import com.zerck.postApp.status.UsernameStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/loginForm")
    public String showLoginForm(){
        log.info("[GET] MemberController.showLoginForm");
        return "/loginForm";
    }

    @GetMapping("/joinForm")
    public String showJoinForm(){
        log.info("[GET] MemberController.showJoinForm");
        return "/joinForm";
    }

    @PostMapping("/idCheck")
    public ResponseEntity<IdCheckResponse> idCheck(@RequestBody String username){

        log.info("[POST] MemberController.idCheck @PARAM username : " + username);

        UsernameStatus usernameStatus = memberService.checkId(username);
        if(usernameStatus == UsernameStatus.DUPLICATE){
            return new ResponseEntity<>(new IdCheckResponse(UsernameStatus.DUPLICATE), HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(new IdCheckResponse(UsernameStatus.AVAILABLE), HttpStatus.OK);
    }

    @PostMapping("/emailCheck")
    public ResponseEntity<EmailCheckResponse> emailCheck(@RequestBody String email){

        log.info("[POST] MemberController.emailCheck @PARAM email : " + email);

        EmailStatus emailStatus = memberService.checkEmail(email);
        if(emailStatus == EmailStatus.DUPLICATE){
            return new ResponseEntity<>(new EmailCheckResponse(EmailStatus.DUPLICATE), HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(new EmailCheckResponse(EmailStatus.AVAILABLE), HttpStatus.OK);
    }

    @PostMapping("/join")
    public ResponseEntity<String> join(){


        return new ResponseEntity<>("successed", HttpStatus.OK);
    }

}

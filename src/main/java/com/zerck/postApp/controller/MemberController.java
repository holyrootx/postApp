package com.zerck.postApp.controller;

import com.zerck.postApp.domain.MemberDTO;
import com.zerck.postApp.response.EmailCheckResponse;
import com.zerck.postApp.response.IdCheckResponse;
import com.zerck.postApp.response.JoinResponse;
import com.zerck.postApp.service.MemberService;
import com.zerck.postApp.status.EmailStatus;
import com.zerck.postApp.status.JoinResponseStatus;
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
    public ResponseEntity<JoinResponse> idCheck(@RequestBody String username){

        log.info("[POST] MemberController.idCheck @PARAM username : " + username);

        JoinResponseStatus usernameStatus = memberService.checkId(username);
        if(usernameStatus == JoinResponseStatus.DUPLICATE_EMAIL){
            return new ResponseEntity<>(new JoinResponse(JoinResponseStatus.DUPLICATE_EMAIL), HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(new JoinResponse(JoinResponseStatus.AVAILABLE_EMAIL), HttpStatus.OK);
    }

    @PostMapping("/emailCheck")
    public ResponseEntity<JoinResponse> emailCheck(@RequestBody String email){

        log.info("[POST] MemberController.emailCheck @PARAM email : " + email);

        JoinResponseStatus emailStatus = memberService.checkEmail(email);
        if(emailStatus == JoinResponseStatus.AVAILABLE_EMAIL){
            return new ResponseEntity<>(new JoinResponse(JoinResponseStatus.AVAILABLE_EMAIL), HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(new JoinResponse(JoinResponseStatus.AVAILABLE_EMAIL), HttpStatus.OK);
    }

    @PostMapping("/join")
    public ResponseEntity<JoinResponse> join(@RequestBody MemberDTO memberDTO){
        log.info(memberDTO);

        JoinResponseStatus usernameStatus = memberService.checkId(memberDTO.getUsername());

        if(JoinResponseStatus.DUPLICATE_USERNAME == usernameStatus){
            return new ResponseEntity<>(new JoinResponse(JoinResponseStatus.DUPLICATE_USERNAME),HttpStatus.CONFLICT);
        }

        JoinResponseStatus emailStatus = memberService.checkEmail(memberDTO.getEmail());

        if(JoinResponseStatus.DUPLICATE_EMAIL == emailStatus){
            return new ResponseEntity<>(new JoinResponse(JoinResponseStatus.DUPLICATE_EMAIL),HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(new JoinResponse(JoinResponseStatus.SUCCESS), HttpStatus.CREATED);
    }

}

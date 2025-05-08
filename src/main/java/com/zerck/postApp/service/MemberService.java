package com.zerck.postApp.service;

import com.zerck.postApp.entity.Member;
import com.zerck.postApp.repository.MemberRepository;
import com.zerck.postApp.response.JoinResponse;
import com.zerck.postApp.status.EmailStatus;
import com.zerck.postApp.status.JoinResponseStatus;
import com.zerck.postApp.status.UsernameStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public JoinResponse checkId(String username){

        Optional<Member> byUsername = memberRepository.findByUsername(username);

        if(byUsername.isEmpty()){
            return new JoinResponse(JoinResponseStatus.AVAILABLE_USERNAME);
        } else{
            return new JoinResponse(JoinResponseStatus.DUPLICATE_USERNAME);
        }

    }

    public JoinResponse checkEmail(String email){

        Optional<Member> byEmail = memberRepository.findByEmail(email);

        if(byEmail.isEmpty()){
            return new JoinResponse(JoinResponseStatus.AVAILABLE_EMAIL);
        } else{
            return new JoinResponse(JoinResponseStatus.DUPLICATE_EMAIL);
        }

    }
}

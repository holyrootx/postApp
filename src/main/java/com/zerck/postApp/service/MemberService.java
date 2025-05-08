package com.zerck.postApp.service;

import com.zerck.postApp.entity.Member;
import com.zerck.postApp.repository.MemberRepository;
import com.zerck.postApp.status.EmailStatus;
import com.zerck.postApp.status.JoinResponseStatus;
import com.zerck.postApp.status.UsernameStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public JoinResponseStatus checkId(String username){

        Optional<Member> byUsername = memberRepository.findByUsername(username);

        return byUsername.isPresent() ? JoinResponseStatus.DUPLICATE_USERNAME : JoinResponseStatus.AVAILABLE_USERNAME;
    }

    public JoinResponseStatus checkEmail(String email){

        Optional<Member> byEmail = memberRepository.findByEmail(email);

        return byEmail.isPresent() ? JoinResponseStatus.DUPLICATE_EMAIL : JoinResponseStatus.AVAILABLE_EMAIL;
    }
}

package com.zerck.postApp.repository;

import com.zerck.postApp.entity.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByUsername(String username);
    Optional<Member> findByEmail(String email);
//    Optional<Member> findByLastname(String lastname, Pageable pageable);


}

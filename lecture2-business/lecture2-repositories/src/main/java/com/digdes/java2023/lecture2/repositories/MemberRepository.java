package com.digdes.java2023.lecture2.repositories;

import com.digdes.java2023.lecture2.model.Member;

import java.util.List;

public interface MemberRepository {

    Member createMember(Member member);

    List<Member> getAll();
}

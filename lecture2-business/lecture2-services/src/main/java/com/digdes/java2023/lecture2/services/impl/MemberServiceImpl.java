package com.digdes.java2023.lecture2.services.impl;

import com.digdes.java2023.lecture2.dto.member.CreateMemberDto;
import com.digdes.java2023.lecture2.dto.member.MemberDto;
import com.digdes.java2023.lecture2.mapping.MemberMapper;
import com.digdes.java2023.lecture2.model.Member;
import com.digdes.java2023.lecture2.repositories.MemberRepository;
import com.digdes.java2023.lecture2.repositories.impl.MemberRepositoryImpl;
import com.digdes.java2023.lecture2.repositories.impl.file.MemberFileRepositoryImpl;
import com.digdes.java2023.lecture2.services.MemberService;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper = new MemberMapper();
    private final MemberRepository memberRepository = new MemberFileRepositoryImpl();

    public MemberDto create(CreateMemberDto newMember){
        Member member = memberMapper.create(newMember);
        member = memberRepository.createMember(member);
        return memberMapper.map(member);
    }

    public List<MemberDto> getAll(){
        List<Member> members = memberRepository.getAll();
        return members.stream().map(memberMapper::map).collect(Collectors.toList());
    }

}

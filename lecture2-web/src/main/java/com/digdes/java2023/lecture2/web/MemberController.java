package com.digdes.java2023.lecture2.web;

import com.digdes.java2023.lecture2.dto.member.CreateMemberDto;
import com.digdes.java2023.lecture2.dto.member.MemberDto;
import com.digdes.java2023.lecture2.services.MemberService;
import com.digdes.java2023.lecture2.services.impl.MemberServiceImpl;

import java.util.List;

public class MemberController {

    private final MemberService memberService = new MemberServiceImpl();



    public MemberDto create(CreateMemberDto request){
        return memberService.create(request);
    }

    public List<MemberDto> getAll(){
        return memberService.getAll();
    }
}

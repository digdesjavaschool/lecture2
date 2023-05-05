package com.digdes.java2023.lecture2.services;

import com.digdes.java2023.lecture2.dto.member.CreateMemberDto;
import com.digdes.java2023.lecture2.dto.member.MemberDto;

import java.util.List;

public interface MemberService {

    MemberDto create(CreateMemberDto memberDto);

    List<MemberDto> getAll();


}

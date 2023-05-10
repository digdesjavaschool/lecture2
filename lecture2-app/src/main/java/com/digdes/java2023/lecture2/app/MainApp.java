package com.digdes.java2023.lecture2.app;

import com.digdes.java2023.lecture2.dto.member.CreateMemberDto;
import com.digdes.java2023.lecture2.dto.member.MemberDto;
import com.digdes.java2023.lecture2.web.MemberController;

import java.util.List;

public class MainApp {

    private static final MemberController memberController = new MemberController();

    public static void main(String... args) {
        CreateMemberDto newMember1 = new CreateMemberDto();
        newMember1.setFirstName("Иван");
        newMember1.setFirstName("Федорович");
        MemberDto createdMember1 = memberController.create(newMember1);
        System.out.println("===== Created member 1========");
        System.out.println(createdMember1);


        CreateMemberDto newMember2 = new CreateMemberDto();
        newMember2.setFirstName("Дима");
        newMember2.setFirstName("Какой");

        System.out.println("===== Created member 2 ========");
        MemberDto createdMember2 = memberController.create(newMember2);
        System.out.println(createdMember2);

        System.out.println("======== All members =========");
        List<MemberDto> allMembers = memberController.getAll();
        System.out.println(allMembers);

    }
}

package com.digdes.java2023.lecture2.repositories.impl.file;

import com.digdes.java2023.lecture2.model.Member;
import com.digdes.java2023.lecture2.repositories.MemberRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class MemberFileRepositoryImpl implements MemberRepository {

    private final AtomicLong idGenerator;

    public MemberFileRepositoryImpl() {
        idGenerator = new AtomicLong(getAll().size());
    }

    public Member createMember(Member member) {
        member.setId(idGenerator.incrementAndGet());
        List<Member> members = getAll();

        members.add(member);
        try (FileOutputStream fileOutputStream = new FileOutputStream("member.model");
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
            out.writeObject(members);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return member;
    }

    public List<Member> getAll() {
        List<Member> members = new ArrayList<>();
        if (new File("member.model").isFile()) {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("member.model"));
                members = (List<Member>) in.readObject();
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
                e.printStackTrace();
            }
        }

        return members;
    }
}

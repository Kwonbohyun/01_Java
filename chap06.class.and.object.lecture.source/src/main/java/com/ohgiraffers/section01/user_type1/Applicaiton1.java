package com.ohgiraffers.section01.user_type1;

import com.ohgiraffers.section01.user_type.Member;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Applicaiton1 {

    public static void main(String[] args) {
        // 회원 (아이디,비밀번호, 이름, 나이, 성별, 취미) 이 정보들을 관리하려고 함.
        String id = "user01";
        String password = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구", "볼링", "테니스"}

        System.out.println("id = " + id);
        System.out.println("password = " + password);
        System.out.println("name + " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobby = ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");

        }
        System.out.println();


        Member1 member = new Member1();

        System.out.println("=============== 생성한 객체 필드값 출력 =================");
        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobby : " + member.hobby);

        // 필드에 접근해 변수처럼 사용



















    }




}


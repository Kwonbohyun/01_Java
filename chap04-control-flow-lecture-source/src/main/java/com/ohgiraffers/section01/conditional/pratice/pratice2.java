package com.ohgiraffers.section01.conditional.pratice;

import java.util.Scanner;



public class Application3 {

    public void testStar() {

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄의 수를 입력하세요 : ");
        int row = sc.nextInt();

        for (int i = row; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            // 별찍고 줄바꾸기
            System.out.println();

        }
    }

    public void testStar1() {

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++){
                System.out.print("*");
            }

            // 별찍고 줄바꾸기
            System.out.println();

        }
    }

    public void testStar2() {

        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int a = 2; a <= i*2; a++){
                System.out.print("*");
            }

            // 별찍고 줄바꾸기
            System.out.println();

        }
    }

    public void practice2 () {


        Scanner sc =  new Scanner(System.in);
        System.out.println("영어 점수를 입력해주세요 : ");
        int english = sc.nextInt();

        System.out.println("수학 점수를 입력해주세요 : ");
        int math = sc.nextInt();

        int average = (english + math)/2;

        if (average >= 60) {
            if(math >= 40) {
                if (english >= 40) {
                    System.out.println("시험 합격");
                } else {
                    System.out.println("한과목 과락으로 인한 불합격");
                }

            } else if(english >= 40) {
                System.out.println("한 과목 과락으로 인한 불합격");
            } else {
                System.out.println("시험 불합격");
            }

        } else {
            System.out.println("시험 불합격");
        }
    }


}


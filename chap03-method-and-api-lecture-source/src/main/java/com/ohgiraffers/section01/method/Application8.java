package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        // static 메서드 호출
        // static 메서드 <--> non-static 메서드

        /*
        * static 메소드를 호출하는 방법
        * [클래스명],[메소드명]()
        * */

        System.out.println("10과 20의 합 : " + Application8.sumTwonumbers(10,20));

        System.out.println("10과 20의 합 : " + sumTwonumbers(20, 30));


    }

    public static int sumTwonumbers(int first, int second) {

        return first + second;
    }
}

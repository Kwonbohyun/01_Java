package com.ohgiraffers.section3.increment;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 증감연산자
        *
        * 피연산자의 앞 또는 뒤에 사용 가능
        * '++' : 1 증가의 의미
        * '--' : 1 감소의 의미
         */

      // 단항으로 사용될 때
        int num = 20;
        System.out.println("num = " + num); //20

        num++;
        System.out.println("num = " + num); //21

        ++num;
        System.out.println("num = " + num); //22

        num--;
        System.out.println("num = " + num); //21

        --num;
        System.out.println(" num = " + num); //20

        // 증감연산자를 다른 연산자오 ㅏ함꼐 사용
        /*
        *
        * * 증감연산자는 다른 연산자와 함꼐 사용할 떄 의미가 달라진다.
        * '++var : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행한다
        * *var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자으 ㅣ값을 1 증가시킨다
        * '--var' : 피연산자의 값을 먼저 1 감소 시킨 뒤 다른 연산을 진행한다.
        * 'var--' : 다른 연산을 먼저 진행하고 난 뒤에 마지막에 피연산자의 값을 1 감소시킨다.
        * */

        int firstNum = 20;

        int result1 = firstNum++ * 3; //
        System.out.println(" result1 = " + result1);
        System.out.println("result2 = " + firstNum);

        int secondNum = 20;

        int result2 = ++secondNum +3; //63
        System.out.println("result2 = " + result2);
        System.out.println("secondNum = " + secondNum);


        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum = " + addNum);
        System.out.println("num1 = " + num1);




    }
}










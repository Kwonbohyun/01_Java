package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;



        Application10 app10 = new Application10();

        System.out.println("두수를 더한 결과 : " + app10.plusTwoNumber(num1, num2));
        System.out.println("두수를 뺀 결과 : " + app10.minusTwoNumber(num1, num2));
        System.out.println("두수를 곱한 결과 : " + app10.multipleTwoNumber(num1, num2));
        System.out.println("두수를 나눈 결과 : " + app10.divideTwoNumber(num1, num2));


    }

    // 두 수를 더한 결과를 반환하는 메서드         // 더하기
    public int plusTwoNumber(int num1, int num2) {

        return num1 + num2;

    }

    // 두 수를 뺸 결과를 반환하는 메서드    // 빼기
    public int minusTwoNumber(int num1, int num2) {

        return num1 - num2;

    }

    // 두 수를 곱한 결과를 반환하는 메서드
    public int multipleTwoNumber(int num1, int num2) {

        return num1 * num2;

    }

    // 두 수를 나눈 결과를 반환하는 메서드
    public int divideTwoNumber(int num1, int num2) {

        return num1 / num2;





        // 곱하기

        // 나누기

        // 나머지
    }
}


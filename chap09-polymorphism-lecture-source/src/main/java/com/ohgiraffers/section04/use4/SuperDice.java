package com.ohgiraffers.section04.use4;

public class SuperDice implements Dice{

    private int min;
    private int max;


    /*
    * - Dice 인터페이스를 구현한 수현체
    * - min 과 max 를 필드로 가지고 있다.
    * - min과 max는 각각 1과 10으로 기본생성자를 통해 초기화된다.
    * - getNumber(0 시 min ~ max까지의 랜덤한 수를 출력해준다.
    * */

    public SuperDice() {
        this.max = 10;
        this.min = 1;
    }

    @Override
    public int getNumber() {


        // 1 ~ 10
        int num = (int)(Math.random()*10) + 1;

        return num;


    }


}
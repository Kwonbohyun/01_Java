package com.ohgiraffers.section04.use4;

public class Application {

    public static void main(String[] args) {
        // 다형성
        Dice dice = new HellDice(); // Superdice 로 변경해도 작동되게

        Dicer dicer = new Dicer();

        dicer.throwDice(dice);
    }
}

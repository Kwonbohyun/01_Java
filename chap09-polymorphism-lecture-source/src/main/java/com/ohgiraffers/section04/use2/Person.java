package com.ohgiraffers.section04.use2;

public class Person {

    private SaveProvider saveProvider;

    public Person(SaveProvider saverProvider){
        this.saveProvider = saverProvider;
    }


    public void doSomething() {

        String data = "문자열 데이터";

        saveProvider.save(data);

    }



}

////package com.ohgiraffers.section02.superkeyword;
////
////import com.ohgiraffers.section02.Product;
////
////public class Computer extends Product {
//
//    // Computer는 하나의 Product 이지만, 모든 Product는 Computer가 아니다.
//
//    private String cpu;             // cpu
//    private int hdd;                // 하드디스크 용량
//    private int ram;                // 램 용량
//    private String operationSystem;  //운영체제
//
//
//    // 기본생성자
//    public Computer() {
//
//        //super();
//        System.out.println("Computer 클래스의 기본 생성자 호출함...");
//    }
//}
////




////        @Override
////        public String getInformation() {
////            // 부모클래스 필드까지 다 출력을하려면
////            return "Computer ["
////                    + "code = " + super.getCode()
////                    + ", name = " + super.getName()
////                    + ", price = " + super.getPrice()
////                    + ", brand = " + super.getBrand()
////                    + ", manufactureingDate = " + super.getManufacturingDate()
////                    + ", cpu = " + this.cpu
////                    + ", hdd = " + this.hdd
////                    + ", ram = " + this.ram
////                    + ", operationSystem = " + this.operationSystem
////                    + "]";
//
//
///*
//* super.getInformation() : 정상적으로 부모의 매소드를 호출
//*
//* */
//
////@Override
////        public String getInformation() {
////            return super.getInformation()
////                    + "Computer ["
////                    + "cpu = " + this.cpu
////                    +",  hdd + " + thus.cpu
